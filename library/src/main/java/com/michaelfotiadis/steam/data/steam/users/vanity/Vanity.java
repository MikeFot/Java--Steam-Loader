package com.michaelfotiadis.steam.data.steam.users.vanity;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Vanity implements SteamApiModel {

    @SerializedName("steamid")
    private final String steamId;
    @SerializedName("success")
    private final Integer success;
    @SerializedName("message")
    private final String message;

    public Vanity(final String steamId, final Integer success, final String message) {
        this.steamId = steamId;
        this.success = success;
        this.message = message;
    }

    /**
     * @return
     */
    @Nullable
    public String getSteamId() {
        return steamId;
    }

    /**
     * @return The status of the request. 1 if successful, 42 if there was no match.
     */
    @Nonnull
    public Integer getSuccess() {
        return success;
    }

    /**
     * @return
     */
    @Nullable
    public String getMessage() {
        return message;
    }

}