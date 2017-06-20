package com.michaelfotiadis.steam.data.steam.users.user;


import com.michaelfotiadis.steam.data.steam.SteamApiModel;
import com.michaelfotiadis.steam.data.steam.player.library.Library;

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
