package com.michaelfotiadis.steam.dota2.model.api.hero;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeroContainerImpl implements HeroContainer {

    @SerializedName("heroes")
    private final List<Hero> heroes;
    @SerializedName("status")
    private final Integer status;
    @SerializedName("count")
    private final Integer count;


    public HeroContainerImpl(final List<Hero> heroes, final Integer status, final Integer count) {
        this.heroes = heroes;
        this.status = status;
        this.count = count;
    }

    @Override
    public List<Hero> getHeroes() {
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