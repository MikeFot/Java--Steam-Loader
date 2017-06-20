package com.michaelfotiadis.steam.data.steam.player.library;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

import java.util.List;

public class Library implements SteamApiModel {

    @SerializedName("game_count")
    private final Integer gameCount;
    @SerializedName("games")
    private final List<Game> games;


    public Library(final Integer gameCount, final List<Game> games) {
        this.gameCount = gameCount;
        this.games = games;
    }

    public Integer getGameCount() {
        return this.gameCount;
    }

    public List<Game> getGames() {
        return this.games;
    }


}