package com.michaelfotiadis.steam.data.player.api;


import com.google.gson.annotations.SerializedName;

public class VanityResponseImpl implements VanityResponse {

    @SerializedName("steamid")
    private final String steamId;
    @SerializedName("success")
    private final Integer success;
    @SerializedName("message")
    private final String message;

    public VanityResponseImpl(final String steamId, final Integer success, final String message) {
        this.steamId = steamId;
        this.success = success;
        this.message = message;
    }

    @Override
    public String getSteamId() {
        return steamId;
    }

    @Override
    public Integer getSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }

}