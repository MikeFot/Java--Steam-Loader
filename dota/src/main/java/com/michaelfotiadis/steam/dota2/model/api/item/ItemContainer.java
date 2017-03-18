package com.michaelfotiadis.steam.dota2.model.api.item;

import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface ItemContainer extends DotaApiModel {
    List<Item> getItems();

    Integer getStatus();
}
