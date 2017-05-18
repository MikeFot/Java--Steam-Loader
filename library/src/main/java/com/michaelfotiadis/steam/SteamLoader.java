package com.michaelfotiadis.steam;

import com.google.gson.Gson;
import com.michaelfotiadis.steam.net.NetworkLoader;
import com.michaelfotiadis.steam.net.OkHttpFactory;
import com.michaelfotiadis.steam.net.api.GamesApi;
import com.michaelfotiadis.steam.net.api.dota2.Dota2Api;
import com.michaelfotiadis.steam.net.api.steam.UsersApi;
import com.michaelfotiadis.steam.provider.dota.Dota2ApiProvider;
import com.michaelfotiadis.steam.provider.games.GamesApiProvider;
import com.michaelfotiadis.steam.provider.player.PlayerApiProvider;

public class SteamLoader {

    private final String key;
    private final NetworkLoader networkLoader;
    private final boolean isDebugEnabled;
    private Dota2ApiProvider dota2Provider;
    private GamesApiProvider gamesProvider;
    private PlayerApiProvider playerProvider;

    public SteamLoader(final String key) {
        this(key, false);
    }

    private SteamLoader(final String key, final boolean isDebugEnabled, final NetworkLoader networkLoader) {
        this.key = key;
        this.isDebugEnabled = isDebugEnabled;
        this.networkLoader = networkLoader;

    }

    public SteamLoader(final String key, final boolean isDebugEnabled) {
        this(key, isDebugEnabled, new NetworkLoader(isDebugEnabled));
    }

    public SteamLoader(final String key,
                       final boolean isDebugEnabled,
                       final OkHttpFactory okHttpFactory,
                       final Gson gson) {
        this(key, isDebugEnabled, new NetworkLoader(okHttpFactory, gson));
    }

    public Dota2Api getDota2Api() {
        return networkLoader.getDota2Api();
    }

    public GamesApi getGamesApi() {
        return networkLoader.getGamesApi();
    }

    public UsersApi getPlayerApi() {
        return networkLoader.getUsersApi();
    }

    public Dota2ApiProvider getDota2Provider() {
        if (dota2Provider == null) {
            dota2Provider = new Dota2ApiProvider(key, isDebugEnabled, networkLoader.getDota2Api());
        }
        return dota2Provider;
    }

    public GamesApiProvider getGamesProvider() {
        if (gamesProvider == null) {
            gamesProvider = new GamesApiProvider(key, networkLoader.getGamesApi());
        }
        return gamesProvider;
    }

    public PlayerApiProvider getPlayerProvider() {
        if (playerProvider == null) {
            playerProvider = new PlayerApiProvider(key, networkLoader.getUsersApi());
        }
        return playerProvider;
    }

}