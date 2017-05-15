package com.michaelfotiadis.steam.data.player.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LibraryImpl implements Library {

    @SerializedName("game_count")
    private final Integer gameCount;
    @SerializedName("games")
    private final List<Game> games;


    public LibraryImpl(final Integer gameCount, final List<Game> games) {
        this.gameCount = gameCount;
        this.games = games;
    }

    @Override
    public Integer getGameCount() {
        return this.gameCount;
    }

    @Override
    public List<Game> getGames() {
        return this.games;
    }


}