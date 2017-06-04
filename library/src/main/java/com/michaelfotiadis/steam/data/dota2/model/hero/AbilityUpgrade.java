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

    /**
     * @return ID of the ability upgraded.
     */
    public Integer getAbility() {
        return this.ability;
    }


    /**
     *
     * @return Time since match start that the ability was upgraded.
     */
    public Integer getTime() {
        return time;
    }

    /**
     *
     * @return The level of the player at time of upgrading.
     */
    public Integer getLevel() {
        return level;
    }


}