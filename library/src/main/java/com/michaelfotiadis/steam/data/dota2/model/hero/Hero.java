package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 *
 */
public interface Hero extends DotaApiModel {
    String getName();

    Integer getId();

    String getLocalizedName();
}
