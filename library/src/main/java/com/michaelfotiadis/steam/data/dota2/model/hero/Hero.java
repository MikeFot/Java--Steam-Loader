package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetHeroes
 */
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

    /**
     * @return The tokenized string for the name of the hero.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return ID of the hero.
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return The localized name of the hero for use in name display.
     */
    public String getLocalizedName() {
        return localizedName;
    }


}