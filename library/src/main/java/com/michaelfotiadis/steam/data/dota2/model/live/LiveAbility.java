package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LiveAbility implements DotaApiModel {

    @SerializedName("ability_id")
    private final Integer abilityId;
    @SerializedName("ability_level")
    private final Integer abilityLevel;

    public LiveAbility(final Integer abilityId, final Integer abilityLevel) {
        this.abilityId = abilityId;
        this.abilityLevel = abilityLevel;
    }

    public Integer getAbilityId() {
        return abilityId;
    }

    public Integer getAbilityLevel() {
        return abilityLevel;
    }
}