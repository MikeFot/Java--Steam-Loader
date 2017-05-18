package com.michaelfotiadis.steam.net.gson;

import java.util.HashSet;
import java.util.Set;

/* package */ final class TypeAdapterFactoryCreator {
    private static final String JSON_TYPE_FIELD = "gsonObjectType";

    private final Set<RuntimeTypeAdapterFactory> mAdapters;
    private final Set<Class<?>> mBaseTypes = new HashSet<>();
    private final Set<Class<?>> mSubTypes = new HashSet<>();

    TypeAdapterFactoryCreator() {
        mAdapters = new HashSet<>();

    }

    /**
     * Generates a collection of {@link RuntimeTypeAdapterFactory}
     *
     * @return {@link Set} of {@link RuntimeTypeAdapterFactory}
     */
    Set<RuntimeTypeAdapterFactory> getAdapters() {
        return mAdapters;
    }

    private <T> RuntimeTypeAdapterFactory create(final Class<T> baseType, final Class<? extends T> subType) {
        final String subTypeName = subType.getSimpleName();

        if (!mBaseTypes.add(baseType)) {
            throw new IllegalStateException("You have already added BaseType " + baseType.getName());
        }

        if (!mSubTypes.add(subType)) {
            throw new IllegalStateException("You have already added SubType " + subType.getName());
        }

        return RuntimeTypeAdapterFactory
                .of(baseType, subTypeName, JSON_TYPE_FIELD)
                .registerSubtype(subType, subTypeName);
    }

}