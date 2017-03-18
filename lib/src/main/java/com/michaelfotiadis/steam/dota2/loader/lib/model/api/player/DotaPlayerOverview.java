package com.michaelfotiadis.steam.dota2.loader.lib.model.api.player;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface DotaPlayerOverview extends DotaApiModel {

    Long getAccountId();

    Integer getPlayerSlot();

    Integer getHeroId();

}
