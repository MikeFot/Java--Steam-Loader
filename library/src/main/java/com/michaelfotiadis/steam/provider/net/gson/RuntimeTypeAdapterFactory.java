/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.michaelfotiadis.steam.provider.net.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Adapts values whose runtime type may differ from their declaration type. This
 * is necessary when a field's type is not the same type that GSON should create
 * when deserialising that field. For example, consider these types:
 * <pre>   {@code
 *   abstract class Shape {
 *     int x;
 *     int y;
 *   }
 *   class Circle extends Shape {
 *     int radius;
 *   }
 *   class Rectangle extends Shape {
 *     int width;
 *     int height;
 *   }
 *   class Diamond extends Shape {
 *     int width;
 *     int height;
 *   }
 *   class Drawing {
 *     Shape bottomShape;
 *     Shape topShape;
 *   }
 * }</pre>
 * <p>Without additional type information, the serialized JSON is ambiguous. Is
 * the bottom shape in this drawing a rectangle or a diamond? <pre>   {@code
 *   {
 *     "bottomShape": {
 *       "width": 10,
 *       "height": 5,
 *       "x": 0,
 *       "y": 0
 *     },
 *     "topShape": {
 *       "radius": 2,
 *       "x": 4,
 *       "y": 1
 *     }
 *   }}</pre>
 * This class addresses this problem by adding type information to the
 * serialized JSON and honoring that type information when the JSON is
 * deserialised: <pre>   {@code
 *   {
 *     "bottomShape": {
 *       "type": "Diamond",
 *       "width": 10,
 *       "height": 5,
 *       "x": 0,
 *       "y": 0
 *     },
 *     "topShape": {
 *       "type": "Circle",
 *       "radius": 2,
 *       "x": 4,
 *       "y": 1
 *     }
 *   }}</pre>
 * Both the type field name ({@code "type"}) and the type labels ({@code
 * "Rectangle"}) are configurable.
 * <p/>
 * <h3>Registering Types</h3>
 * Create a {@code RuntimeTypeAdapter} by passing the base type and type field
 * name to the {@link #of} factory method. If you don't supply an explicit type
 * field name, {@code "type"} will be used. <pre>   {@code
 *   RuntimeTypeAdapter<Shape> shapeAdapter
 *       = RuntimeTypeAdapter.of(Shape.class, "type");
 * }</pre>
 * Next register all of your subtypes. Every subtype must be explicitly
 * registered. This protects your application from injection attacks. If you
 * don't supply an explicit type label, the type's simple name will be used.
 * <pre>   {@code
 *   shapeAdapter.registerSubtype(Rectangle.class, "Rectangle");
 *   shapeAdapter.registerSubtype(Circle.class, "Circle");
 *   shapeAdapter.registerSubtype(Diamond.class, "Diamond");
 * }</pre>
 * Finally, register the type adapter in your application's GSON builder:
 * <pre>   {@code
 *   Gson gson = new GsonBuilder()
 *       .registerTypeAdapter(Shape.class, shapeAdapter)
 *       .create();
 * }</pre>
 * Like {@code GsonBuilder}, this API supports chaining: <pre>   {@code
 *   RuntimeTypeAdapter<Shape> shapeAdapter = RuntimeTypeAdapterFactory.of(Shape.class)
 *       .registerSubtype(Rectangle.class)
 *       .registerSubtype(Circle.class)
 *       .registerSubtype(Diamond.class);
 * }</pre>
 */
final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final String defaultSubTypeLabel;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap<>();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap<>();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(final Class<?> baseType,
                                      final String defaultSubTypeLabel,
                                      final String typeFieldName) {

        if (typeFieldName == null || baseType == null) {
            throw new NullPointerException();
        }
        this.baseType = baseType;
        this.typeFieldName = typeFieldName;
        this.defaultSubTypeLabel = defaultSubTypeLabel;
    }

    public <R> TypeAdapter<R> create(final Gson gson, final TypeToken<R> type) {
        if (type.getRawType() != baseType) {
            return null;
        }

        final Map<String, TypeAdapter<?>> labelToDelegate = new LinkedHashMap<>();
        final Map<Class<?>, TypeAdapter<?>> subtypeToDelegate = new LinkedHashMap<>();

        for (final Map.Entry<String, Class<?>> entry : labelToSubtype.entrySet()) {
            final TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
            labelToDelegate.put(entry.getKey(), delegate);
            subtypeToDelegate.put(entry.getValue(), delegate);
        }

        return new TypeAdapter<R>() {
            private String getBaseTypeLabel(final JsonElement labelJsonElement) {
                final String label;

                if (labelJsonElement == null) {
                    if (defaultSubTypeLabel == null) {
                        throw new JsonParseException("cannot deserialize " + baseType + " because it does not define a field named " + typeFieldName);
                    } else {
                        label = defaultSubTypeLabel;

                        if (!labelToDelegate.containsKey(label)) {
                            throw new IllegalStateException("WTF: Was looking for " + label + " in " + labelToDelegate.keySet());
                        }

                    }
                } else {
                    label = labelJsonElement.getAsString();
                }

                return label;
            }

            @Override
            public R read(final JsonReader in) throws IOException {
                final JsonElement jsonElement = Streams.parse(in);
                // fix for null Json Elements
                if (jsonElement.isJsonNull()) {
                    return null;
                }

                final JsonElement labelJsonElement = jsonElement.getAsJsonObject().remove(typeFieldName);
                final String label = getBaseTypeLabel(labelJsonElement);
                @SuppressWarnings("unchecked")  // registration requires that subtype extends T
                final TypeAdapter<R> delegate = (TypeAdapter<R>) labelToDelegate.get(label);

                if (delegate == null) {
                    throw new JsonParseException("cannot deserialize " + baseType + " subtype named " + label + "; did you forget to register a subtype?");
                }

                return delegate.fromJsonTree(jsonElement);
            }

            @Override
            public void write(final JsonWriter out, final R value) throws IOException {
                if (value != null) {
                    final Class<?> srcType = value.getClass();
                    final String label = subtypeToLabel.get(srcType);
                    @SuppressWarnings("unchecked") final // registration requires that subtype extends T
                            TypeAdapter<R> delegate = (TypeAdapter<R>) subtypeToDelegate.get(srcType);
                    if (delegate == null) {
                        throw new JsonParseException("cannot serialize " + srcType.getName()
                                + "; did you forget to register a subtype?");
                    }
                    final JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
                    if (jsonObject.has(typeFieldName)) {
                        throw new JsonParseException("cannot serialize " + srcType.getName()
                                + " because it already defines a field named " + typeFieldName);
                    }
                    final JsonObject clone = new JsonObject();
                    clone.add(typeFieldName, new JsonPrimitive(label));
                    for (final Map.Entry<String, JsonElement> e : jsonObject.entrySet()) {
                        clone.add(e.getKey(), e.getValue());
                    }
                    Streams.write(clone, out);
                } else {
                    out.nullValue();
                }
            }
        };
    }

    /**
     * Registers {@code type} identified by its {@link Class#getSimpleName simple
     * name}. Labels are case sensitive.
     *
     * @throws IllegalArgumentException if either {@code type} or its simple name
     *                                  have already been registered on this type adapter.
     */
    @SuppressWarnings("unused")
    public RuntimeTypeAdapterFactory<T> registerSubtype(final Class<? extends T> type) {
        return registerSubtype(type, type.getSimpleName());
    }

    /**
     * Registers {@code type} identified by {@code label}. Labels are case
     * sensitive.
     *
     * @throws IllegalArgumentException if either {@code type} or {@code label}
     *                                  have already been registered on this type adapter.
     */
    RuntimeTypeAdapterFactory<T> registerSubtype(final Class<? extends T> type, final String label) {
        if (type == null || label == null) {
            throw new NullPointerException();
        }
        if (subtypeToLabel.containsKey(type) || labelToSubtype.containsKey(label)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }

        labelToSubtype.put(label, type);
        subtypeToLabel.put(type, label);
        return this;
    }

    /**
     * Creates a new runtime type adapter using for {@code baseType} using {@code
     * typeFieldName} as the type field name. Type field names are case sensitive.
     */
    public static <T> RuntimeTypeAdapterFactory<T> of(final Class<T> baseType, final String defaultSubTypeLabel, final String typeFieldName) {
        return new RuntimeTypeAdapterFactory<>(baseType, defaultSubTypeLabel, typeFieldName);
    }
}