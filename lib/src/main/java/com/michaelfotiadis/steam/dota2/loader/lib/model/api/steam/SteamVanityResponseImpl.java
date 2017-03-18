package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.google.gson.annotations.SerializedName;

public class SteamVanityResponseImpl implements SteamVanityResponse {

    @SerializedName("steamid")
    private final String steamId;
    @SerializedName("success")
    private final Integer success;
    @SerializedName("message")
    private final String message;

    public SteamVanityResponseImpl(final String steamId, final Integer success, final String message) {
        this.steamId = steamId;
        this.success = success;
        this.message = message;
    }

    @Override
    public String getSteamid() {
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