package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * Information about the team playing as radiant for this match.
 *
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LiveTeam implements DotaApiModel {

    @SerializedName("team_name")
    private final String teamName;
    @SerializedName("team_id")
    private final String teamId;
    @SerializedName("team_logo")
    private final String teamLogo;
    @SerializedName("complete")
    private final Boolean complete;

    public LiveTeam(final String teamName,
                    final String teamId,
                    final String teamLogo,
                    final Boolean complete) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.teamLogo = teamLogo;
        this.complete = complete;
    }

    /**
     * @return The team's name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @return The team's unique ID.
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * @return The UGC id for the team logo. You can resolve this with the GetUGCFileDetails method.
     */
    public String getTeamLogo() {
        return teamLogo;
    }

    /**
     * @return Whether the players for this team are all team members.
     */
    public Boolean getComplete() {
        return complete;
    }
}