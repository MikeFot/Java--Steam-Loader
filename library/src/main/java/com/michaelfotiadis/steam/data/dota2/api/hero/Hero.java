package com.michaelfotiadis.steam.data.dota2.api.hero;

import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

/**
 *
 */
public interface Hero extends DotaApiModel {
    String getName();

    Integer getId();

    String getLocalizedName();
}
