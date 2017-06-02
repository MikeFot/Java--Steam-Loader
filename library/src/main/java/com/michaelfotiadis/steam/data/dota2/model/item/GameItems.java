package com.michaelfotiadis.steam.data.dota2.model.item;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * See: https://wiki.teamfortress.com/wiki/WebAPI/GetGameItems
 */
public class GameItems implements DotaApiModel {

    @SerializedName("items")
    private final List<GameItem> items;
    @SerializedName("status")
    private final Integer status;


    public GameItems(final List<GameItem> items, final int status) {
        this.items = items;
        this.status = status;
    }

    /**
     * @return List of items.
     */
    public List<GameItem> getItems() {
        return items;
    }

    public Integer getStatus() {
        return status;
    }

}