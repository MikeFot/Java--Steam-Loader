package com.michaelfotiadis.steam.data.dota2.model.leagues;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLeagueListing">Wiki</a>
 */
public class Leagues implements DotaApiModel {

    @SerializedName("leagues")
    private final List<League> leagues;

    public Leagues(final List<League> leagues) {
        this.leagues = leagues;
    }

    /**
     * @return A list of leagues supported in-game via DotaTV.
     */
    public List<League> getLeagues() {
        return leagues;
    }
}