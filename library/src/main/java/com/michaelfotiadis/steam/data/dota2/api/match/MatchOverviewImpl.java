package com.michaelfotiadis.steam.data.dota2.api.match;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.api.player.PlayerOverview;

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

    @Override
    public Long getMatchId() {
        return matchId;
    }

    @Override
    public Integer getMatchSeqNum() {
        return matchSeqNum;
    }

    @Override
    public Integer getStartTime() {
        return startTime;
    }

    @Override
    public Integer getLobbyType() {
        return lobbyType;
    }

    @Override
    public Integer getRadiantTeamId() {
        return radiantTeamId;
    }

    @Override
    public Integer getDireTeamId() {
        return this.direTeamId;
    }

    @Override
    public List<PlayerOverview> getPlayers() {
        return players;
    }

}