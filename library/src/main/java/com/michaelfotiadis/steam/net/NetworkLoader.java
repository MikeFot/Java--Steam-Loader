package com.michaelfotiadis.steam.net;

import com.google.gson.Gson;
import com.michaelfotiadis.steam.api.dota2.Dota2EconApi;
import com.michaelfotiadis.steam.api.dota2.Dota2MatchApi;
import com.michaelfotiadis.steam.api.steam.PlayerApi;
import com.michaelfotiadis.steam.api.steam.UsersApi;
import com.michaelfotiadis.steam.net.gson.SteamGson;

public class NetworkLoader {

    private static final String ENDPOINT = "https://api.steampowered.com/";

    private final RestClient steamRestClient;

    public NetworkLoader(final OkHttpFactory okHttpFactory,
                         final Gson gson) {
        this.steamRestClient = new RestClient(ENDPOINT, gson, okHttpFactory);
    }

    public NetworkLoader(final boolean isDebugEnabled) {
        this(new OkHttpFactoryImpl(isDebugEnabled), SteamGson.buildGson());
    }


    public Dota2MatchApi getDota2MatchApi() {
        return this.steamRestClient.getDota2MatchApi();
    }

    public Dota2EconApi getDota2EconApi() {
        return this.steamRestClient.getDota2EconomyApi();
    }

    public UsersApi getUsersApi() {
        return this.steamRestClient.getUsersApi();
    }

    public PlayerApi getPlayerApi() {
        return this.steamRestClient.getPlayerApi();
    }

}
