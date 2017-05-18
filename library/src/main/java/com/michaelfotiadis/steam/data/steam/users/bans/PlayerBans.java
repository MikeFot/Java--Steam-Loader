package com.michaelfotiadis.steam.data.steam.users.bans;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerBans">Wiki</a>
 */
public class PlayerBans {

    @SerializedName("players")
    private final List<PlayerBan> players;

    public PlayerBans(List<PlayerBan> players) {
        this.players = players;
    }

    /**
     * @return List of player ban objects for each given (and valid) 64 bit ID.
     */
    @Nonnull
    public List<PlayerBan> getPlayers() {
        return players;
    }

}
