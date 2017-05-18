package com.michaelfotiadis.steam.data.player.model.backpack;

import com.google.gson.annotations.SerializedName;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerItems
 */
public class AccountInfo {

    @SerializedName("steamid")
    private final Integer steamId;
    @SerializedName("personaname")
    private final String personaName;

    public AccountInfo(final Integer steamId, final String personaName) {
        this.steamId = steamId;
        this.personaName = personaName;
    }

    /**
     * @return The specified user's unique 64-bit Steam ID.
     */
    public Integer getSteamId() {
        return steamId;
    }

    /**
     * @return The specified user's current name on Steam.
     */
    public String getPersonaName() {
        return personaName;
    }
}