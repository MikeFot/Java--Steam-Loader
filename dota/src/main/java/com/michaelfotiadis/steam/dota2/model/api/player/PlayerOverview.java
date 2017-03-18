package com.michaelfotiadis.steam.dota2.model.api.player;


import com.michaelfotiadis.steam.dota2.model.api.DotaApiModel;

/**
 *
 */
public interface PlayerOverview extends DotaApiModel {

    Long getAccountId();

    Integer getPlayerSlot();

    Integer getHeroId();

}
