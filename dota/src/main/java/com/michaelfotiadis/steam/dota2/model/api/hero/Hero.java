package com.michaelfotiadis.steam.dota2.model.api.hero;

import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface Hero extends DotaApiModel {
    String getName();

    Integer getId();

    String getLocalizedName();
}
