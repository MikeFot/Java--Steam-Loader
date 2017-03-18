package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.player.DotaPlayerOverview;

import java.util.List;

public class DotaMatchOverviewImpl implements DotaMatchOverview {

    @SerializedName("match_id")
    private final Long mMatchId;
    @SerializedName("match_seq_num")
    private final Integer mMatchSeqNum;
    @SerializedName("start_time")
    private final Integer mStartTime;
    @SerializedName("lobby_type")
    private final Integer mLobbyType;
    @SerializedName("radiant_team_id")
    private final Integer mRadiantTeamId;
    @SerializedName("dire_team_id")
    private final Integer mDireTeamId;
    @SerializedName("players")
    private final List<DotaPlayerOverview> mPlayers;

    public DotaMatchOverviewImpl(final Long matchId, final Integer matchSeqNum, final Integer startTime, final Integer lobbyType, final Integer radiantTeamId, final Integer direTeamId, final List<DotaPlayerOverview> players) {
        mMatchId = matchId;
        mMatchSeqNum = matchSeqNum;
        mStartTime = startTime;
        mLobbyType = lobbyType;
        mRadiantTeamId = radiantTeamId;
        mDireTeamId = direTeamId;
        mPlayers = players;
    }

    @Override
    public Long getMatchId() {
        return mMatchId;
    }

    @Override
    public Integer getMatchSeqNum() {
        return mMatchSeqNum;
    }

    @Override
    public Integer getStartTime() {
        return mStartTime;
    }

    @Override
    public Integer getLobbyType() {
        return mLobbyType;
    }

    @Override
    public Integer getRadiantTeamId() {
        return mRadiantTeamId;
    }

    @Override
    public Integer getDireTeamId() {
        return mDireTeamId;
    }

    @Override
    public List<DotaPlayerOverview> getPlayers() {
        return mPlayers;
    }

}