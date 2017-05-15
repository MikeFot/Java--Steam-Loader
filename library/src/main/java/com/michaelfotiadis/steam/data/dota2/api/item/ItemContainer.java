package com.michaelfotiadis.steam.data.dota2.api.item;

import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface ItemContainer extends DotaApiModel {
    List<Item> getItems();

    Integer getStatus();
}
