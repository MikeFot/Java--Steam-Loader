package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.google.gson.annotations.SerializedName;

public class HeroImpl implements Hero {

    @SerializedName("name")
    private final String name;
    @SerializedName("id")
    private final Integer id;
    @SerializedName("localized_name")
    private final String localizedName;

    public HeroImpl(final String name, final int id, final String localizedName) {
        this.name = name;
        this.id = id;
        this.localizedName = localizedName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getLocalizedName() {
        return localizedName;
    }


}