package com.michaelfotiadis.steam.data.dota2.model.item;


import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

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
