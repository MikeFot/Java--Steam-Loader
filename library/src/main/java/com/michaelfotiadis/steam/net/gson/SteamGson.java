package com.michaelfotiadis.steam.net.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;

import java.lang.reflect.Modifier;

/**
 *
 */

public final class SteamGson {

    public static Gson buildGson() {

        final GsonBuilder gson = new GsonBuilder();

        gson.setPrettyPrinting();
        gson.serializeNulls();
        gson.excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE);

        // register the type adapter factories
        final TypeAdapterFactoryCreator creator = new TypeAdapterFactoryCreator();
        for (final TypeAdapterFactory factory : creator.getAdapters()) {
            gson.registerTypeAdapterFactory(factory);
        }

        return gson.create();
    }

}
