package com.michaelfotiadis.steam.data.dota2.model.hero;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetHeroes
 */
public class Heroes implements DotaApiModel {

    @SerializedName("heroes")
    private final List<Hero> heroes;
    @SerializedName("status")
    private final Integer status;
    @SerializedName("count")
    private final Integer count;


    public Heroes(final List<Hero> heroes, final Integer status, final Integer count) {
        this.heroes = heroes;
        this.status = status;
        this.count = count;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getCount() {
        return this.count;
    }

}