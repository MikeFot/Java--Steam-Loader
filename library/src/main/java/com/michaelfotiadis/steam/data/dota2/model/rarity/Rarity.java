package com.michaelfotiadis.steam.data.dota2.model.rarity;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class Rarity implements DotaApiModel {

    @SerializedName("name")
    private final String name;
    @SerializedName("id")
    private final Integer id;
    @SerializedName("order")
    private final Integer order;
    @SerializedName("color")
    private final String color;
    @SerializedName("localized_name")
    private final String localizedName;

    public Rarity(final String name, final Integer id, final Integer order, final String color, final String localizedName) {
        this.name = name;
        this.id = id;
        this.order = order;
        this.color = color;
        this.localizedName = localizedName;
    }

    /**
     * @return The internal rarity name string.
     */
    public String getName() {
        return name;
    }

    /**
     * @return ID of rarity, used for indexing.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return Sorting and logical order of rarities, from most distributed to least.
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * @return String of the hexadecimal RGB tuple of the rarity name as it is displayed in-game.
     */
    public String getColor() {
        return color;
    }

    /**
     * @return The localized name of the rarity for use in name display.
     */
    public String getLocalizedName() {
        return localizedName;
    }
}