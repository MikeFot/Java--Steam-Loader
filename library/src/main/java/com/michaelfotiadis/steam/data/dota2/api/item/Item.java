package com.michaelfotiadis.steam.data.dota2.api.item;


import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

/**
 *
 */
public interface Item extends DotaApiModel {
    Integer getId();

    String getName();

    Integer getCost();

    Integer getSecretShop();

    Integer getSideShop();

    Integer getRecipe();

    String getLocalizedName();
}
