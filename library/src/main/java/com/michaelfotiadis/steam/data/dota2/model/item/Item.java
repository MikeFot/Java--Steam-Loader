package com.michaelfotiadis.steam.data.dota2.model.item;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class Item implements DotaApiModel {

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

    public Item(final Integer id, final String name, final Integer cost, final Integer secretShop, final Integer sideShop, final Integer recipe, final String localizedName) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.secretShop = secretShop;
        this.sideShop = sideShop;
        this.recipe = recipe;
        this.localizedName = localizedName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return this.cost;
    }

    public Integer getSecretShop() {
        return secretShop;
    }

    public Integer getSideShop() {
        return sideShop;
    }

    public Integer getRecipe() {
        return recipe;
    }

    public String getLocalizedName() {
        return localizedName;
    }
}