package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SteamLibraryImpl implements SteamLibrary {

    @SerializedName("game_count")
    private final Integer gameCount;
    @SerializedName("games")
    private final List<SteamGame> games;


    public SteamLibraryImpl(final Integer gameCount, final List<SteamGame> games) {
        this.gameCount = gameCount;
        this.games = games;
    }

    @Override
    public Integer getGameCount() {
        return this.gameCount;
    }

    @Override
    public List<SteamGame> getGames() {
        return this.games;
    }


}