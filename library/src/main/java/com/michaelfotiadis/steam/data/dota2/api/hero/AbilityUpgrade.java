package com.michaelfotiadis.steam.data.dota2.api.hero;

import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

/**
 *
 */
public interface AbilityUpgrade extends DotaApiModel {

    Integer getAbility();

    Integer getTime();

    Integer getLevel();

}
