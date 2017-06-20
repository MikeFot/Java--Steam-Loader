package com.michaelfotiadis.steam.data.steam.users.recent;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;
import com.michaelfotiadis.steam.data.steam.player.library.Game;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetRecentlyPlayedGames">Wiki</a>
 */
public class RecentlyPlayed implements SteamApiModel {

    @SerializedName("total_count")
    private final Integer totalCount;
    @SerializedName("games")
    private final List<Game> games;

    public RecentlyPlayed(final Integer totalCount, final List<Game> games) {
        this.totalCount = totalCount;
        this.games = games;
    }

    /**
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @return
     */
    public List<Game> getGames() {
        return games;
    }
}