package com.michaelfotiadis.steam.dota2.loader.lib.model.api.item;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaItem extends DotaApiModel {
    Integer getId();

    String getName();

    Integer getCost();

    Integer getSecretShop();

    Integer getSideShop();

    Integer getRecipe();

    String getLocalizedName();
}
