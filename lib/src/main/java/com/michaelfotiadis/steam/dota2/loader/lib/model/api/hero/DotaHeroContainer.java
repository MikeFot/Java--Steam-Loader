package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface DotaHeroContainer extends DotaApiModel {
    List<DotaHero> getHeroes();

    Integer getStatus();

    Integer getCount();
}
