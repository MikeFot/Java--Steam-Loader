package com.michaelfotiadis.steam.model;


/**
 */
public class UserImpl implements User {

    private final AccountDetails accountDetails;
    private final Library gameLibrary;


    public UserImpl(final AccountDetails accountDetails, final Library gameLibrary) {
        this.accountDetails = accountDetails;
        this.gameLibrary = gameLibrary;
    }

    @Override
    public AccountDetails getAccountDetails() {
        return this.accountDetails;
    }

    @Override
    public Library getGameLibrary() {
        return this.gameLibrary;
    }

}
