package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class Hero implements DotaApiModel {

    @SerializedName("name")
    private final String name;
    @SerializedName("id")
    private final Integer id;
    @SerializedName("localized_name")
    private final String localizedName;

    public Hero(final String name, final int id, final String localizedName) {
        this.name = name;
        this.id = id;
        this.localizedName = localizedName;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getLocalizedName() {
        return localizedName;
    }


}