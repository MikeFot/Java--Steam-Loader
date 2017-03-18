package com.michaelfotiadis.steam.dota2.loader.lib.model.api.item;

import com.google.gson.annotations.SerializedName;

public class DotaItemImpl implements DotaItem {

    @SerializedName("id")
    private final Integer mId;
    @SerializedName("name")
    private final String mName;
    @SerializedName("cost")
    private final Integer mCost;
    @SerializedName("secret_shop")
    private final Integer mSecretShop;
    @SerializedName("side_shop")
    private final Integer mSideShop;
    @SerializedName("recipe")
    private final Integer mRecipe;
    @SerializedName("localized_name")
    private final String mLocalizedName;

    public DotaItemImpl(final Integer id, final String name, final Integer cost, final Integer secretShop, final Integer sideShop, final Integer recipe, final String localizedName) {
        mId = id;
        mName = name;
        mCost = cost;
        mSecretShop = secretShop;
        mSideShop = sideShop;
        mRecipe = recipe;
        mLocalizedName = localizedName;
    }

    @Override
    public Integer getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public Integer getCost() {
        return mCost;
    }

    @Override
    public Integer getSecretShop() {
        return mSecretShop;
    }

    @Override
    public Integer getSideShop() {
        return mSideShop;
    }

    @Override
    public Integer getRecipe() {
        return mRecipe;
    }

    @Override
    public String getLocalizedName() {
        return mLocalizedName;
    }
}