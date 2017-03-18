package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam.SteamLibrary;

public class SteamLibraryResponse {
    @SerializedName("response")
    private final SteamLibrary mResponse;

    public SteamLibraryResponse(final SteamLibrary response) {
        this.mResponse = response;
    }

    public SteamLibrary getResponse() {
        return mResponse;
    }

}
