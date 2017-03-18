package com.michaelfotiadis.steam.dota2.loader.lib.model.api.match;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.dota2.loader.lib.model.api.player.DotaPlayerDetails;

import java.util.List;

@SuppressWarnings("ClassWithTooManyFields")
public class DotaMatchDetailsImpl implements DotaMatchDetails {

    @SerializedName("players")
    private final List<DotaPlayerDetails> mPlayers;
    @SerializedName("radiant_win")
    private final Boolean mRadiantWin;
    @SerializedName("duration")
    private final Integer mDuration;
    @SerializedName("start_time")
    private final Long mStartTime;
    @SerializedName("match_id")
    private final Long mMatchId;
    @SerializedName("match_seq_num")
    private final Long mMatchSeqNum;
    @SerializedName("tower_status_radiant")
    private final Long mTowerStatusRadiant;
    @SerializedName("tower_status_dire")
    private final Long mTowerStatusDire;
    @SerializedName("barracks_status_radiant")
    private final Long mBarracksStatusRadiant;
    @SerializedName("barracks_status_dire")
    private final Long mBarracksStatusDire;
    @SerializedName("cluster")
    private final Integer mCluster;
    @SerializedName("first_blood_time")
    private final Integer mFirstBloodTime;
    @SerializedName("lobby_type")
    private final Integer mLobbyType;
    @SerializedName("human_players")
    private final Integer mHumanPlayers;
    @SerializedName("leagueid")
    private final Integer mLeagueid;
    @SerializedName("positive_votes")
    private final Integer mPositiveVotes;
    @SerializedName("negative_votes")
    private final Integer mNegativeVotes;
    @SerializedName("game_mode")
    private final Integer mGameMode;


    public DotaMatchDetailsImpl(final List<DotaPlayerDetails> players, final Boolean radiantWin, final Integer duration, final Long startTime, final Long matchId, final Long matchSeqNum, final Long towerStatusRadiant, final Long towerStatusDire, final Long barracksStatusRadiant, final Long barracksStatusDire, final Integer cluster, final Integer firstBloodTime, final Integer lobbyType, final Integer humanPlayers, final Integer leagueid, final Integer positiveVotes, final Integer negativeVotes, final Integer gameMode) {
        mPlayers = players;
        mRadiantWin = radiantWin;
        mDuration = duration;
        mStartTime = startTime;
        mMatchId = matchId;
        mMatchSeqNum = matchSeqNum;
        mTowerStatusRadiant = towerStatusRadiant;
        mTowerStatusDire = towerStatusDire;
        mBarracksStatusRadiant = barracksStatusRadiant;
        mBarracksStatusDire = barracksStatusDire;
        mCluster = cluster;
        mFirstBloodTime = firstBloodTime;
        mLobbyType = lobbyType;
        mHumanPlayers = humanPlayers;
        mLeagueid = leagueid;
        mPositiveVotes = positiveVotes;
        mNegativeVotes = negativeVotes;
        mGameMode = gameMode;
    }

    @Override
    public List<DotaPlayerDetails> getPlayers() {
        return mPlayers;
    }

    @Override
    public Boolean getRadiantWin() {
        return mRadiantWin;
    }

    @Override
    public Integer getDuration() {
        return mDuration;
    }

    @Override
    public Long getStartTime() {
        return mStartTime;
    }

    @Override
    public Long getMatchId() {
        return mMatchId;
    }

    @Override
    public Long getMatchSeqNum() {
        return mMatchSeqNum;
    }

    @Override
    public Long getTowerStatusRadiant() {
        return mTowerStatusRadiant;
    }

    @Override
    public Long getTowerStatusDire() {
        return mTowerStatusDire;
    }

    @Override
    public Long getBarracksStatusRadiant() {
        return mBarracksStatusRadiant;
    }

    @Override
    public Long getBarracksStatusDire() {
        return mBarracksStatusDire;
    }

    @Override
    public Integer getCluster() {
        return mCluster;
    }

    @Override
    public Integer getFirstBloodTime() {
        return mFirstBloodTime;
    }

    @Override
    public Integer getLobbyType() {
        return mLobbyType;
    }

    @Override
    public Integer getHumanPlayers() {
        return mHumanPlayers;
    }

    @Override
    public Integer getLeagueid() {
        return mLeagueid;
    }

    @Override
    public Integer getPositiveVotes() {
        return mPositiveVotes;
    }

    @Override
    public Integer getNegativeVotes() {
        return mNegativeVotes;
    }

    @Override
    public Integer getGameMode() {
        return mGameMode;
    }

}