package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaHeroContainerImpl implements DotaHeroContainer {

    @SerializedName("heroes")
    private final List<DotaHero> mHeroes;
    @SerializedName("status")
    private final Integer mStatus;
    @SerializedName("count")
    private final Integer mCount;


    public DotaHeroContainerImpl(final List<DotaHero> heroes, final Integer status, final Integer count) {
        mHeroes = heroes;
        mStatus = status;
        mCount = count;
    }

    @Override
    public List<DotaHero> getHeroes() {
        return mHeroes;
    }

    @Override
    public Integer getStatus() {
        return mStatus;
    }

    @Override
    public Integer getCount() {
        return mCount;
    }

}