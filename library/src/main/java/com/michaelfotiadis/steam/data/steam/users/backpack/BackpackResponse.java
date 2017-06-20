package com.michaelfotiadis.steam.data.steam.users.backpack;

import com.google.gson.annotations.SerializedName;

public class BackpackResponse {

    @SerializedName("result")
    private final Backpack result;

    public BackpackResponse(final Backpack result) {
        this.result = result;
    }

    public Backpack getResult() {
        return result;
    }
}