package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaAbilityUpgrade extends DotaApiModel {
    int getAbility();

    int getTime();

    int getLevel();
}
