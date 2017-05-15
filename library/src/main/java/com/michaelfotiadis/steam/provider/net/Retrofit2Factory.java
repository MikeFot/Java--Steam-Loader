package com.michaelfotiadis.steam.provider.net;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*package*/ class Retrofit2Factory {

    private final String baseUrl;
    private final Gson gson;
    private final OkHttpFactory httpFactory;

    public Retrofit2Factory(final String baseUrl,
                            final Gson gson,
                            final OkHttpFactory httpFactory) {
        this.baseUrl = baseUrl;
        this.httpFactory = httpFactory;
        this.gson = gson;
    }

    public Retrofit create(final Class<?> clazz) {

        final retrofit2.Converter.Factory factory = GsonConverterFactory.create(gson);
        final OkHttpClient client = httpFactory.create(clazz);

        return new Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .client(client)
                .addConverterFactory(factory)
                .build();
    }
}
