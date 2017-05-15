package com.michaelfotiadis.steam.data.player.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.api.Library;

public class LibraryResponse {
    @SerializedName("response")
    private final Library response;

    public LibraryResponse(final Library response) {
        this.response = response;
    }

    public Library getResponse() {
        return response;
    }

}
