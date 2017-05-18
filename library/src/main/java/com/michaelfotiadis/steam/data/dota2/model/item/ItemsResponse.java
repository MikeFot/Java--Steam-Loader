package com.michaelfotiadis.steam.data.dota2.model.item;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

public class ItemsResponse implements DotaApiModel {

    @SerializedName("items")
    private final List<Item> items;
    @SerializedName("status")
    private final Integer status;


    public ItemsResponse(final List<Item> items, final int status) {
        this.items = items;
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public Integer getStatus() {
        return status;
    }

}