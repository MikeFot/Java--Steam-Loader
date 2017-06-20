package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class Scoreboard implements DotaApiModel {

    @SerializedName("duration")
    private final Double duration;
    @SerializedName("roshan_respawn_timer")
    private final Integer roshanRespawnTimer;
    @SerializedName("radiant")
    private final Faction radiant;
    @SerializedName("dire")
    private final Faction dire;

    public Scoreboard(final Double duration, final Integer roshanRespawnTimer, final Faction radiant, final Faction dire) {
        this.duration = duration;
        this.roshanRespawnTimer = roshanRespawnTimer;
        this.radiant = radiant;
        this.dire = dire;
    }

    public Double getDuration() {
        return duration;
    }

    public Integer getRoshanRespawnTimer() {
        return roshanRespawnTimer;
    }

    public Faction getRadiant() {
        return radiant;
    }

    public Faction getDire() {
        return dire;
    }
}