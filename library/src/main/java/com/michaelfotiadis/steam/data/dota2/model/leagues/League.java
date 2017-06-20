package com.michaelfotiadis.steam.data.dota2.model.leagues;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLeagueListing">Wiki</a>
 */
public class League implements DotaApiModel {

    @SerializedName("name")
    private final String name;
    @SerializedName("leagueid")
    private final Integer leagueid;
    @SerializedName("description")
    private final String description;
    @SerializedName("tournament_url")
    private final String tournamentUrl;
    @SerializedName("itemdef")
    private final Integer itemdef;

    public League(final String name,
                  final Integer leagueid,
                  final String description,
                  final String tournamentUrl,
                  final Integer itemdef) {
        this.name = name;
        this.leagueid = leagueid;
        this.description = description;
        this.tournamentUrl = tournamentUrl;
        this.itemdef = itemdef;
    }

    /**
     * @return The name of the league.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The league's unique ID.
     */
    public Integer getLeagueid() {
        return leagueid;
    }

    /**
     * @return A description of the league.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return The league's website.
     */
    public String getTournamentUrl() {
        return tournamentUrl;
    }

    /**
     * @return *undocumented*
     */
    public Integer getItemdef() {
        return itemdef;
    }
}