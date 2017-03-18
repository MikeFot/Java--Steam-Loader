package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaHero extends DotaApiModel {
    String getName();

    Integer getId();

    String getLocalizedName();
}
