package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;

public class SteamAccountResponse {
    @SerializedName("response")
    private final SteamPlayerResponse mResponse;

    public SteamAccountResponse(SteamPlayerResponse response) {
        this.mResponse = response;
    }

    public SteamPlayerResponse getResult() {
        return mResponse;
    }
}
