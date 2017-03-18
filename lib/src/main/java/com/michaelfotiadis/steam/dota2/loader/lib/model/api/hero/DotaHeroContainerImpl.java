package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaHeroContainerImpl implements DotaHeroContainer {

    @SerializedName("heroes")
    private final List<DotaHero> heroes;
    @SerializedName("status")
    private final Integer status;
    @SerializedName("count")
    private final Integer count;


    public DotaHeroContainerImpl(final List<DotaHero> heroes, final Integer status, final Integer count) {
        this.heroes = heroes;
        this.status = status;
        this.count = count;
    }

    @Override
    public List<DotaHero> getHeroes() {
        return heroes;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public Integer getCount() {
        return this.count;
    }

}