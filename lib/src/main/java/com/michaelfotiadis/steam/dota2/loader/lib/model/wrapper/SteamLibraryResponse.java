package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam.SteamLibrary;

public class SteamLibraryResponse {
    @SerializedName("response")
    private final SteamLibrary response;

    public SteamLibraryResponse(final SteamLibrary response) {
        this.response = response;
    }

    public SteamLibrary getResponse() {
        return response;
    }

}
