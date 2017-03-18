package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.michaelfotiadis.steam.dota2.loader.lib.model.api.DotaApiModel;

/**
 *
 */
public interface SteamVanityResponse extends DotaApiModel {
    String getSteamid();

    Integer getSuccess();

    String getMessage();
}
