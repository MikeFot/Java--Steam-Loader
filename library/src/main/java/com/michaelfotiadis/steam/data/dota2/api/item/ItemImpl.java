package com.michaelfotiadis.steam.data.dota2.api.item;

import com.google.gson.annotations.SerializedName;

public class ItemImpl implements Item {

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

    public ItemImpl(final Integer id, final String name, final Integer cost, final Integer secretShop, final Integer sideShop, final Integer recipe, final String localizedName) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.secretShop = secretShop;
        this.sideShop = sideShop;
        this.recipe = recipe;
        this.localizedName = localizedName;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }

    @Override
    public Integer getSecretShop() {
        return secretShop;
    }

    @Override
    public Integer getSideShop() {
        return sideShop;
    }

    @Override
    public Integer getRecipe() {
        return recipe;
    }

    @Override
    public String getLocalizedName() {
        return localizedName;
    }
}