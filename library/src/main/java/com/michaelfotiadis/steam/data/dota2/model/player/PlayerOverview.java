package com.michaelfotiadis.steam.data.dota2.model.player;


import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 *
 */
public interface PlayerOverview extends DotaApiModel {

    Long getAccountId();

    Integer getPlayerSlot();

    Integer getHeroId();

}
