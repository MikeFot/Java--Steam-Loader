package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SteamLibraryImpl implements SteamLibrary {

    @SerializedName("game_count")
    private final Integer mGameCount;
    @SerializedName("games")
    private final List<SteamGame> mGames;


    public SteamLibraryImpl(final Integer gameCount, final List<SteamGame> games) {
        mGameCount = gameCount;
        mGames = games;
    }

    @Override
    public Integer getGameCount() {
        return mGameCount;
    }

    @Override
    public List<SteamGame> getGames() {
        return mGames;
    }


}