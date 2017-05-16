package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 *
 */
public interface HeroContainer extends DotaApiModel {
    List<Hero> getHeroes();

    Integer getStatus();

    Integer getCount();
}
