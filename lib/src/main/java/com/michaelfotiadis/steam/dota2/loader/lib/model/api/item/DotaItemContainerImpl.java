package com.michaelfotiadis.steam.dota2.loader.lib.model.api.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaItemContainerImpl implements DotaItemContainer {

    @SerializedName("items")
    private final List<DotaItem> mItems;
    @SerializedName("status")
    private final Integer mStatus;


    public DotaItemContainerImpl(final List<DotaItem> items, final int status) {
        mItems = items;
        mStatus = status;
    }

    @Override
    public List<DotaItem> getItems() {
        return mItems;
    }

    @Override
    public Integer getStatus() {
        return mStatus;
    }

}