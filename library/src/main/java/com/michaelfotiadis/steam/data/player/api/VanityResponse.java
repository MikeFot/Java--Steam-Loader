package com.michaelfotiadis.steam.data.player.api;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

/**
 *
 */
public interface VanityResponse extends SteamApiModel {

    String getSteamId();

    Integer getSuccess();

    String getMessage();

}
