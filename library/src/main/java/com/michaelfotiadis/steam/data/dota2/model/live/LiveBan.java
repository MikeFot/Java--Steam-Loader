package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LiveBan implements DotaApiModel {

    @SerializedName("hero_id")
    private final Integer heroId;

    public LiveBan(final Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getHeroId() {
        return heroId;
    }
}