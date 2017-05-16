package com.michaelfotiadis.steam.data.dota2.model.rarity;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class RaritiesResponse implements DotaApiModel {

    @SerializedName("result")
    private final Rarities result;


    public RaritiesResponse(final Rarities result) {
        this.result = result;
    }

    public Rarities getResult() {
        return result;
    }
}