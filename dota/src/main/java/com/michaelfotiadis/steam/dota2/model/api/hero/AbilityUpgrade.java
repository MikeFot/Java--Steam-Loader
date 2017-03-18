package com.michaelfotiadis.steam.dota2.model.api.hero;

import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface AbilityUpgrade extends DotaApiModel {

    Integer getAbility();

    Integer getTime();

    Integer getLevel();

}
