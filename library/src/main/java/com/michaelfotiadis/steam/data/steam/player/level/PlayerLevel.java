package com.michaelfotiadis.steam.data.steam.player.level;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetSteamLevel">Wiki</a>
 */
public class PlayerLevel implements SteamApiModel {

    @SerializedName("player_level")
    private final Integer playerLevel;

    public PlayerLevel(final Integer playerLevel) {
        this.playerLevel = playerLevel;
    }

    public Integer getPlayerLevel() {
        return playerLevel;
    }
}

