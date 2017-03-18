package com.michaelfotiadis.steam.dota2.model.api.item;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemContainerImpl implements ItemContainer {

    @SerializedName("items")
    private final List<Item> items;
    @SerializedName("status")
    private final Integer status;


    public ItemContainerImpl(final List<Item> items, final int status) {
        this.items = items;
        this.status = status;
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

}