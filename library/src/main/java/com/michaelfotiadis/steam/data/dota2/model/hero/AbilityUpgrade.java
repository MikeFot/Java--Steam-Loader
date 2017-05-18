package com.michaelfotiadis.steam.data.dota2.model.hero;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class AbilityUpgrade implements DotaApiModel {

    @SerializedName("ability")
    private final Integer ability;
    @SerializedName("time")
    private final Integer time;
    @SerializedName("level")
    private final Integer level;


    public AbilityUpgrade(final int ability, final int time, final int level) {
        this.ability = ability;
        this.time = time;
        this.level = level;
    }

    public Integer getAbility() {
        return this.ability;
    }

    public Integer getTime() {
        return time;
    }

    public Integer getLevel() {
        return level;
    }


}