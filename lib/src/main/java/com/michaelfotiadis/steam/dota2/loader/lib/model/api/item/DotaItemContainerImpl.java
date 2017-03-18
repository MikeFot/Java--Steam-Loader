package com.michaelfotiadis.steam.dota2.loader.lib.model.api.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DotaItemContainerImpl implements DotaItemContainer {

    @SerializedName("items")
    private final List<DotaItem> items;
    @SerializedName("status")
    private final Integer status;


    public DotaItemContainerImpl(final List<DotaItem> items, final int status) {
        this.items = items;
        this.status = status;
    }

    @Override
    public List<DotaItem> getItems() {
        return items;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

}