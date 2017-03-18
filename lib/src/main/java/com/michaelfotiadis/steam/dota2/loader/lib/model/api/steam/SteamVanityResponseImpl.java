package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.google.gson.annotations.SerializedName;

public class SteamVanityResponseImpl implements SteamVanityResponse {

    @SerializedName("steamid")
    private final String mSteamId;
    @SerializedName("success")
    private final Integer mSuccess;
    @SerializedName("message")
    private final String mMessage;

    public SteamVanityResponseImpl(final String steamId, final Integer success, final String message) {
        mSteamId = steamId;
        mSuccess = success;
        mMessage = message;
    }

    @Override
    public String getSteamid() {
        return mSteamId;
    }

    @Override
    public Integer getSuccess() {
        return mSuccess;
    }

    @Override
    public String getMessage() {
        return mMessage;
    }

}