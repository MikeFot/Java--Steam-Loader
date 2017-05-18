package com.michaelfotiadis.steam.data.steam.users.player;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerSummaries">Wiki</a>
 */
public class PlayerSummaries implements SteamApiModel {

    @SerializedName("players")
    private final List<PlayerSummary> players;

    public PlayerSummaries(final List<PlayerSummary> players) {
        this.players = players;
    }

    @Nonnull
    public List<PlayerSummary> getPlayers() {
        return this.players;
    }

}