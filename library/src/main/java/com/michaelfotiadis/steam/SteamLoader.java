package com.michaelfotiadis.steam;

import com.michaelfotiadis.steam.provider.net.NetworkLoader;
import com.michaelfotiadis.steam.provider.Dota2Provider;
import com.michaelfotiadis.steam.provider.GamesProvider;
import com.michaelfotiadis.steam.provider.PlayerProvider;

public class SteamLoader {

    private final String key;
    private final NetworkLoader networkLoader;
    private Dota2Provider dota2Provider;
    private GamesProvider gamesProvider;
    private PlayerProvider playerProvider;

    public SteamLoader(final String key, final boolean isDebugEnabled) {
        this.key = key;
        this.networkLoader = new NetworkLoader(isDebugEnabled);
    }

    public SteamLoader(final String key) {
        this(key, false);
    }

    public Dota2Provider getDota2Provider() {
        if (dota2Provider == null) {
            dota2Provider = new Dota2Provider(key, networkLoader.getDota2Api());
        }
        return dota2Provider;
    }

    public GamesProvider getGamesProvider() {
        if (gamesProvider == null) {
            gamesProvider = new GamesProvider(key, networkLoader.getGamesApi());
        }
        return gamesProvider;
    }

    public PlayerProvider getPlayerProvider() {
        if (playerProvider == null) {
            playerProvider = new PlayerProvider(key, networkLoader.getPlayerApi());
        }
        return playerProvider;
    }

}