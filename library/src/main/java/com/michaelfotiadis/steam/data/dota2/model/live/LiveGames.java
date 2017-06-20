package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LiveGames implements DotaApiModel {

    @SerializedName("games")
    private final List<LiveGame> games;
    @SerializedName("status")
    private final Integer status;

    public LiveGames(final List<LiveGame> games, final Integer status) {
        this.games = games;
        this.status = status;
    }

    /**
     * @return A list of games in-progress.
     */
    public List<LiveGame> getGames() {
        return games;
    }

    public Integer getStatus() {
        return status;
    }
}