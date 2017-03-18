package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;

public class SteamAccountResponse {
    @SerializedName("response")
    private final SteamPlayerResponse response;

    public SteamAccountResponse(final SteamPlayerResponse response) {
        this.response = response;
    }

    public SteamPlayerResponse getResult() {
        return response;
    }
}
