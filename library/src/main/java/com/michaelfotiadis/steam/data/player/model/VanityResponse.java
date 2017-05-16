package com.michaelfotiadis.steam.data.player.model;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

/**
 *
 */
public interface VanityResponse extends SteamApiModel {

    String getSteamId();

    Integer getSuccess();

    String getMessage();

}
