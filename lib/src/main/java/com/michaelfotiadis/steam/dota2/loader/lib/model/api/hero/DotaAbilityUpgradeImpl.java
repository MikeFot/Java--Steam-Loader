package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.google.gson.annotations.SerializedName;

public class DotaAbilityUpgradeImpl implements DotaAbilityUpgrade {

    @SerializedName("ability")
    private final Integer ability;
    @SerializedName("time")
    private final Integer time;
    @SerializedName("level")
    private final Integer level;


    public DotaAbilityUpgradeImpl(final int ability, final int time, final int level) {
        this.ability = ability;
        this.time = time;
        this.level = level;
    }

    @Override
    public Integer getAbility() {
        return this.ability;
    }

    @Override
    public Integer getTime() {
        return time;
    }

    @Override
    public Integer getLevel() {
        return level;
    }


}