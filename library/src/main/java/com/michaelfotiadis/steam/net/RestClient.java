package com.michaelfotiadis.steam.net;

import com.google.gson.Gson;
import com.michaelfotiadis.steam.api.dota2.Dota2EconApi;
import com.michaelfotiadis.steam.api.dota2.Dota2MatchApi;
import com.michaelfotiadis.steam.api.steam.PlayerApi;
import com.michaelfotiadis.steam.api.steam.UsersApi;

import retrofit2.Retrofit;

public class RestClient {

    private final Retrofit2Factory mRetrofit2Factory;

    public RestClient(final String baseUrl,
                      final Gson gson,
                      final OkHttpFactory factory) {

        mRetrofit2Factory = new Retrofit2Factory(baseUrl, gson, factory);

    }

    public Dota2MatchApi getDota2MatchApi() {
        return createApi(Dota2MatchApi.class);
    }

    public UsersApi getUsersApi() {
        return createApi(UsersApi.class);
    }

    public Dota2EconApi getDota2EconomyApi() {
        return createApi(Dota2EconApi.class);
    }

    public PlayerApi getPlayerApi() {
        return createApi(PlayerApi.class);
    }

    private synchronized <T> T createApi(final Class<T> clazz) {
        final Retrofit retrofit = mRetrofit2Factory.create(clazz);
        return retrofit.create(clazz);
    }


}
