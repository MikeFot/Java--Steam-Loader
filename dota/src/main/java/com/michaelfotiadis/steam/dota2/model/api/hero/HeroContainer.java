package com.michaelfotiadis.steam.dota2.model.api.hero;

import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface HeroContainer extends DotaApiModel {
    List<Hero> getHeroes();

    Integer getStatus();

    Integer getCount();
}
