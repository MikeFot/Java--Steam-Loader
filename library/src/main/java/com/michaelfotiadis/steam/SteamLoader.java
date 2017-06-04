package com.michaelfotiadis.steam;

import com.google.gson.Gson;
import com.michaelfotiadis.steam.api.GamesApi;
import com.michaelfotiadis.steam.api.dota2.Dota2EconApi;
import com.michaelfotiadis.steam.api.dota2.Dota2MatchApi;
import com.michaelfotiadis.steam.api.steam.UsersApi;
import com.michaelfotiadis.steam.net.NetworkLoader;
import com.michaelfotiadis.steam.net.OkHttpFactory;
import com.michaelfotiadis.steam.provider.dota.Dota2EconApiProvider;
import com.michaelfotiadis.steam.provider.dota.Dota2MatchApiProvider;
import com.michaelfotiadis.steam.provider.games.GamesApiProvider;
import com.michaelfotiadis.steam.provider.image.ImageProvider;
import com.michaelfotiadis.steam.provider.player.PlayerApiProvider;

public class SteamLoader {

    private final String key;
    private final NetworkLoader networkLoader;
    private final boolean isLoggingEnabled;
    private final boolean isUseTestServer;
    private Dota2MatchApiProvider dota2MatchProvider;
    private Dota2EconApiProvider dota2EconomyApiProvider;
    private GamesApiProvider gamesProvider;
    private PlayerApiProvider playerProvider;
    private ImageProvider imageProvider;

    public SteamLoader(final String key) {
        this(key, false, false);
    }

    private SteamLoader(final String key, final boolean isLoggingEnabled, final boolean isUseTestServer, final NetworkLoader networkLoader) {
        this.key = key;
        this.isLoggingEnabled = isLoggingEnabled;
        this.isUseTestServer = isUseTestServer;
        this.networkLoader = networkLoader;

    }

    public SteamLoader(final String key, final boolean isLoggingEnabled, final boolean isUseTestServer) {
        this(key, isLoggingEnabled, isUseTestServer, new NetworkLoader(isLoggingEnabled));
    }

    public SteamLoader(final String key,
                       final boolean isLoggingEnabled,
                       final boolean isUseTestServer,
                       final OkHttpFactory okHttpFactory,
                       final Gson gson) {
        this(key, isLoggingEnabled, isUseTestServer, new NetworkLoader(okHttpFactory, gson));
    }

    public Dota2MatchApi getDota2MatchApi() {
        return networkLoader.getDota2MatchApi();
    }


    public Dota2EconApi getDota2EconomyApi() {
        return networkLoader.getDota2EconApi();
    }

    public GamesApi getGamesApi() {
        return networkLoader.getGamesApi();
    }

    public UsersApi getPlayerApi() {
        return networkLoader.getUsersApi();
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

    public ImageProvider getImageProvider() {
        if (imageProvider == null) {
            imageProvider = new ImageProvider();
        }
        return imageProvider;
    }

}