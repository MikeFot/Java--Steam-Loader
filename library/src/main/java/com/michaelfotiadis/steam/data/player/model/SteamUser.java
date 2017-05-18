package com.michaelfotiadis.steam.data.player.model;


import com.michaelfotiadis.steam.data.player.SteamApiModel;
import com.michaelfotiadis.steam.data.steam.users.player.PlayerSummary;

/**
 */
public class SteamUser implements SteamApiModel {

    private final PlayerSummary accountDetails;
    private final Library gameLibrary;


    public SteamUser(final PlayerSummary accountDetails, final Library gameLibrary) {
        this.accountDetails = accountDetails;
        this.gameLibrary = gameLibrary;
    }

    public PlayerSummary getAccountDetails() {
        return this.accountDetails;
    }

    public Library getGameLibrary() {
        return this.gameLibrary;
    }

}
