package com.michaelfotiadis.steam.data.dota2.model.item;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetGameItems
 */
public class GameItem implements DotaApiModel {

    @SerializedName("id")
    private final Integer id;
    @SerializedName("name")
    private final String name;
    @SerializedName("cost")
    private final Integer cost;
    @SerializedName("secret_shop")
    private final Integer secretShop;
    @SerializedName("side_shop")
    private final Integer sideShop;
    @SerializedName("recipe")
    private final Integer recipe;
    @SerializedName("localized_name")
    private final String localizedName;

    public GameItem(final Integer id, final String name, final Integer cost, final Integer secretShop, final Integer sideShop, final Integer recipe, final String localizedName) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.secretShop = secretShop;
        this.sideShop = sideShop;
        this.recipe = recipe;
        this.localizedName = localizedName;
    }

    /**
     * @return ID of the item.
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return The tokenized string for the name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return The in-game gold cost of the item.
     */
    public Integer getCost() {
        return this.cost;
    }

    /**
     *
     * @return Boolean - true if the item is only available in the secret shop.
     */
    public Integer getSecretShop() {
        return secretShop;
    }

    /**
     *
     * @return Boolean - true if the item is available in the side shop.
     */
    public Integer getSideShop() {
        return sideShop;
    }

    /**
     *
     * @return Boolean - true if the item is a recipe type item.
     */
    public Integer getRecipe() {
        return recipe;
    }

    /**
     *
     * @return The localized name of the hero for use in name display. You will get it only if specifie 'language' parameter.
     */
    public String getLocalizedName() {
        return localizedName;
    }
}