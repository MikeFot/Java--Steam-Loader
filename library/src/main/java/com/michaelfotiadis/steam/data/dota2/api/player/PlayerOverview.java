package com.michaelfotiadis.steam.data.dota2.api.player;


import com.michaelfotiadis.steam.data.dota2.api.DotaApiModel;

/**
 *
 */
public interface PlayerOverview extends DotaApiModel {

    Long getAccountId();

    Integer getPlayerSlot();

    Integer getHeroId();

}
