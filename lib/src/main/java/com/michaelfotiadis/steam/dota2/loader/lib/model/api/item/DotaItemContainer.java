package com.michaelfotiadis.steam.dota2.loader.lib.model.api.item;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface DotaItemContainer extends DotaApiModel {
    List<DotaItem> getItems();

    Integer getStatus();
}
