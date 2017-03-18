package com.michaelfotiadis.steam.dota2.model.api.item;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

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
