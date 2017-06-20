package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class Faction implements DotaApiModel {

    @SerializedName("score")
    private final Integer score;
    @SerializedName("tower_state")
    private final Integer towerState;
    @SerializedName("barracks_state")
    private final Integer barracksState;
    @SerializedName("picks")
    private final List<LivePick> picks;
    @SerializedName("bans")
    private final List<LiveBan> bans;
    @SerializedName("players")
    private final List<LivePlayerDetails> players;
    @SerializedName("abilities")
    private final List<LiveAbility> abilities;

    public Faction(final Integer score, final Integer towerState, final Integer barracksState, final List<LivePick> picks, final List<LiveBan> bans, final List<LivePlayerDetails> players, final List<LiveAbility> abilities) {
        this.score = score;
        this.towerState = towerState;
        this.barracksState = barracksState;
        this.picks = picks;
        this.bans = bans;
        this.players = players;
        this.abilities = abilities;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getTowerState() {
        return towerState;
    }

    public Integer getBarracksState() {
        return barracksState;
    }

    public List<LivePick> getPicks() {
        return picks;
    }

    public List<LiveBan> getBans() {
        return bans;
    }

    public List<LivePlayerDetails> getPlayers() {
        return players;
    }

    public List<LiveAbility> getAbilities() {
        return abilities;
    }
}