package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


/**
 */
public class SteamUserImpl implements SteamUser {

    private final SteamAccountDetails accountDetails;
    private final SteamLibrary gameLibrary;


    public SteamUserImpl(final SteamAccountDetails accountDetails, final SteamLibrary gameLibrary) {
        this.accountDetails = accountDetails;
        this.gameLibrary = gameLibrary;
    }

    @Override
    public SteamAccountDetails getAccountDetails() {
        return this.accountDetails;
    }

    @Override
    public SteamLibrary getGameLibrary() {
        return this.gameLibrary;
    }

}
