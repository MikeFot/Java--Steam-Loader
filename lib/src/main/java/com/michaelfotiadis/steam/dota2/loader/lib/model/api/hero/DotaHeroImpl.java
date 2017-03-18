package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.google.gson.annotations.SerializedName;

public class DotaHeroImpl implements DotaHero {

    @SerializedName("name")
    private final String mName;
    @SerializedName("id")
    private final int mId;
    @SerializedName("localized_name")
    private final String mLocalizedName;

    public DotaHeroImpl(final String name, final int id, final String localizedName) {
        mName = name;
        mId = id;
        mLocalizedName = localizedName;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public int getId() {
        return mId;
    }

    @Override
    public String getLocalizedName() {
        return mLocalizedName;
    }


}