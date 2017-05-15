package com.michaelfotiadis.steam.data.dota2.api.hero;

import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface HeroContainer extends DotaApiModel {
    List<Hero> getHeroes();

    Integer getStatus();

    Integer getCount();
}
