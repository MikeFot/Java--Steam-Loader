package com.michaelfotiadis.steam;

import com.michaelfotiadis.steam.net.NetworkLoader;
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

    public SteamLoader(final String key, final boolean isDebugEnabled) {
        this.key = key;
        this.isDebugEnabled = isDebugEnabled;
        this.networkLoader = new NetworkLoader(isDebugEnabled);
    }

    public SteamLoader(final String key) {
        this(key, false);
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
            playerProvider = new PlayerApiProvider(key, networkLoader.getPlayerApi());
        }
        return playerProvider;
    }

}