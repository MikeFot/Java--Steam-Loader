package com.michaelfotiadis.steam.data.dota2.model.match.overview;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.player.PlayerOverview;
import com.michaelfotiadis.steam.data.dota2.types.LobbyType;

import java.util.List;

public class MatchOverviewImpl implements MatchOverview {

    @SerializedName("match_id")
    private final Long matchId;
    @SerializedName("match_seq_num")
    private final Integer matchSeqNum;
    @SerializedName("start_time")
    private final Integer startTime;
    @SerializedName("lobby_type")
    private final Integer lobbyType;
    @SerializedName("radiant_team_id")
    private final Integer radiantTeamId;
    @SerializedName("dire_team_id")
    private final Integer direTeamId;
    @SerializedName("players")
    private final List<PlayerOverview> players;

    public MatchOverviewImpl(final Long matchId, final Integer matchSeqNum, final Integer startTime, final Integer lobbyType, final Integer radiantTeamId, final Integer direTeamId, final List<PlayerOverview> players) {
        this.matchId = matchId;
        this.matchSeqNum = matchSeqNum;
        this.startTime = startTime;
        this.lobbyType = lobbyType;
        this.radiantTeamId = radiantTeamId;
        this.direTeamId = direTeamId;
        this.players = players;
    }

    /**
     * @return The match's unique ID.
     */
    @Override
    public Long getMatchId() {
        return matchId;
    }

    /**
     *
     * @return A 'sequence number', representing the order in which matches were recorded.
     */
    @Override
    public Integer getMatchSeqNum() {
        return matchSeqNum;
    }

    /**
     *
     * @return Unix timestamp of when the match began.
     */
    @Override
    public Integer getStartTime() {
        return startTime;
    }

    @Override
    public Integer getLobbyType() {
        return lobbyType;
    }

    @Override
    public LobbyType getLobbyTypeAsEnum() {
        return LobbyType.fromValue(lobbyType);
    }

    @Override
    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    @Override
    public Integer getDireTeamId() {
        return this.direTeamId;
    }

    /**
     *
     * @return The list of players within the match.
     */
    @Override
    public List<PlayerOverview> getPlayers() {
        return players;
    }

}