package com.michaelfotiadis.steam.model.response;

import com.google.gson.annotations.SerializedName;

public class AccountResponse {
    @SerializedName("response")
    private final PlayerResponse response;

    public AccountResponse(final PlayerResponse response) {
        this.response = response;
    }

    public PlayerResponse getResult() {
        return response;
    }
}
