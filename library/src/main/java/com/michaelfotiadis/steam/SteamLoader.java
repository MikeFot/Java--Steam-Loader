package com.michaelfotiadis.steam;

import com.google.gson.Gson;
import com.michaelfotiadis.steam.api.dota2.Dota2EconApi;
import com.michaelfotiadis.steam.api.dota2.Dota2MatchApi;
import com.michaelfotiadis.steam.api.steam.PlayerApi;
import com.michaelfotiadis.steam.api.steam.UsersApi;
import com.michaelfotiadis.steam.net.NetworkLoader;
import com.michaelfotiadis.steam.net.OkHttpFactory;
import com.michaelfotiadis.steam.provider.dota.Dota2EconApiProvider;
import com.michaelfotiadis.steam.provider.dota.Dota2MatchApiProvider;
import com.michaelfotiadis.steam.provider.image.ImageProvider;
import com.michaelfotiadis.steam.provider.player.PlayerApiProvider;
import com.michaelfotiadis.steam.provider.player.UsersApiProvider;

public class SteamLoader {

    private final String key;
    private final NetworkLoader networkLoader;
    private final boolean isUseTestServer;
    private Dota2MatchApiProvider dota2MatchProvider;
    private Dota2EconApiProvider dota2EconomyApiProvider;
    private UsersApiProvider usersProvider;
    private PlayerApiProvider playerProvider;
    private ImageProvider imageProvider;

    public SteamLoader(final String key) {
        this(key, false, false);
    }

    private SteamLoader(final String key,
                        final boolean isUseTestServer,
                        final NetworkLoader networkLoader) {
        this.key = key;
        this.isUseTestServer = isUseTestServer;
        this.networkLoader = networkLoader;

    }

    public SteamLoader(final String key, final boolean isLoggingEnabled, final boolean isUseTestServer) {
        this(key, isUseTestServer, new NetworkLoader(isLoggingEnabled));
    }

    public SteamLoader(final String key,
                       final boolean isUseTestServer,
                       final OkHttpFactory okHttpFactory,
                       final Gson gson) {
        this(key, isUseTestServer, new NetworkLoader(okHttpFactory, gson));
    }

    public Dota2MatchApi getDota2MatchApi() {
        return networkLoader.getDota2MatchApi();
    }

    public Dota2EconApi getDota2EconomyApi() {
        return networkLoader.getDota2EconApi();
    }

    public UsersApi getUsersApi() {
        return networkLoader.getUsersApi();
    }

    public PlayerApi getPlayerApi() {
        return networkLoader.getPlayerApi();
    }

    public Dota2MatchApiProvider getDota2MatchProvider() {
        if (dota2MatchProvider == null) {
            dota2MatchProvider = new Dota2MatchApiProvider(key, isUseTestServer, networkLoader.getDota2MatchApi());
        }
        return dota2MatchProvider;
    }

    public Dota2EconApiProvider getDota2EconomyApiProvider() {
        if (dota2EconomyApiProvider == null) {
            dota2EconomyApiProvider = new Dota2EconApiProvider(key, isUseTestServer, networkLoader.getDota2EconApi());
        }
        return dota2EconomyApiProvider;
    }

    public UsersApiProvider getUsersProvider() {
        if (usersProvider == null) {
            usersProvider = new UsersApiProvider(key, networkLoader.getUsersApi());
        }
        return usersProvider;
    }

    public PlayerApiProvider getPlayerProvider() {
        if (playerProvider == null) {
            playerProvider = new PlayerApiProvider(key, networkLoader.getPlayerApi());
        }
        return playerProvider;
    }

    public ImageProvider getImageProvider() {
        if (imageProvider == null) {
            imageProvider = new ImageProvider();
        }
        return imageProvider;
    }

}