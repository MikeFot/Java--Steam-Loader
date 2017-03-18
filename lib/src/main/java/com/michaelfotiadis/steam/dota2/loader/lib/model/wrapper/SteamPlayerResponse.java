package com.michaelfotiadis.steam.dota2.loader.lib.model.wrapper;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam.SteamAccountDetails;

import java.util.List;

public class SteamPlayerResponse {

    @SerializedName("players")
    private final List<SteamAccountDetails> players;

    public SteamPlayerResponse(final List<SteamAccountDetails> players) {
        this.players = players;
    }

    public List<SteamAccountDetails> getPlayers() {
        return this.players;
    }

}