package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 *
 */
public interface AbilityUpgrade extends DotaApiModel {

    Integer getAbility();

    Integer getTime();

    Integer getLevel();

}
