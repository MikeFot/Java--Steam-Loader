package com.michaelfotiadis.steam.data.player.model;


import com.michaelfotiadis.steam.data.player.SteamApiModel;

/**
 *
 */
public interface User extends SteamApiModel {

    AccountDetails getAccountDetails();

    Library getGameLibrary();

}
