package com.michaelfotiadis.steam.data.dota2.model.item;

import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface ItemResponse extends DotaApiModel {
    List<Item> getItems();

    Integer getStatus();
}
