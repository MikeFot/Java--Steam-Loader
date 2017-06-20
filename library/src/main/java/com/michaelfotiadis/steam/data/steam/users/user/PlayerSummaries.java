package com.michaelfotiadis.steam.data.steam.users.user;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

import java.util.List;


/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerSummaries">Wiki</a>
 */
public class PlayerSummaries implements SteamApiModel {

    @SerializedName("players")
    private final List<PlayerSummary> players;

    public PlayerSummaries(final List<PlayerSummary> players) {
        this.players = players;
    }


    public List<PlayerSummary> getPlayers() {
        return this.players;
    }

}