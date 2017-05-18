package com.michaelfotiadis.steam.data.dota2.model.match.details;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.model.player.PlayerDetails;

import java.util.List;

@SuppressWarnings("ClassWithTooManyFields")
public class MatchDetails implements DotaApiModel {

    @SerializedName("players")
    private final List<PlayerDetails> players;
    @SerializedName("radiant_win")
    private final Boolean radiantWin;
    @SerializedName("duration")
    private final Integer duration;
    @SerializedName("start_time")
    private final Long startTime;
    @SerializedName("match_id")
    private final Long matchId;
    @SerializedName("match_seq_num")
    private final Long matchSeqNum;
    @SerializedName("tower_status_radiant")
    private final Long towerStatusRadiant;
    @SerializedName("tower_status_dire")
    private final Long towerStatusDire;
    @SerializedName("barracks_status_radiant")
    private final Long barracksStatusRadiant;
    @SerializedName("barracks_status_dire")
    private final Long barracksStatusDire;
    @SerializedName("cluster")
    private final Integer cluster;
    @SerializedName("first_blood_time")
    private final Integer firstBloodTime;
    @SerializedName("lobby_type")
    private final Integer lobbyType;
    @SerializedName("human_players")
    private final Integer humanPlayers;
    @SerializedName("leagueid")
    private final Integer leagueid;
    @SerializedName("positive_votes")
    private final Integer positiveVotes;
    @SerializedName("negative_votes")
    private final Integer negativeVotes;
    @SerializedName("game_mode")
    private final Integer gameMode;


    public MatchDetails(final List<PlayerDetails> players, final Boolean radiantWin, final Integer duration, final Long startTime, final Long matchId, final Long matchSeqNum, final Long towerStatusRadiant, final Long towerStatusDire, final Long barracksStatusRadiant, final Long barracksStatusDire, final Integer cluster, final Integer firstBloodTime, final Integer lobbyType, final Integer humanPlayers, final Integer leagueid, final Integer positiveVotes, final Integer negativeVotes, final Integer gameMode) {
        this.players = players;
        this.radiantWin = radiantWin;
        this.duration = duration;
        this.startTime = startTime;
        this.matchId = matchId;
        this.matchSeqNum = matchSeqNum;
        this.towerStatusRadiant = towerStatusRadiant;
        this.towerStatusDire = towerStatusDire;
        this.barracksStatusRadiant = barracksStatusRadiant;
        this.barracksStatusDire = barracksStatusDire;
        this.cluster = cluster;
        this.firstBloodTime = firstBloodTime;
        this.lobbyType = lobbyType;
        this.humanPlayers = humanPlayers;
        this.leagueid = leagueid;
        this.positiveVotes = positiveVotes;
        this.negativeVotes = negativeVotes;
        this.gameMode = gameMode;
    }

    public List<PlayerDetails> getPlayers() {
        return players;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public Long getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public Long getTowerStatusDire() {
        return towerStatusDire;
    }

    public Long getBarracksStatusRadiant() {
        return this.barracksStatusRadiant;
    }

    public Long getBarracksStatusDire() {
        return this.barracksStatusDire;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public Integer getFirstBloodTime() {
        return this.firstBloodTime;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getHumanPlayers() {
        return humanPlayers;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public Integer getPositiveVotes() {
        return positiveVotes;
    }

    public Integer getNegativeVotes() {
        return negativeVotes;
    }

    public Integer getGameMode() {
        return this.gameMode;
    }

}