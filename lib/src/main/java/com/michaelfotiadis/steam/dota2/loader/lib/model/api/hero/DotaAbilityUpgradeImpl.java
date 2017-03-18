package com.michaelfotiadis.steam.dota2.loader.lib.model.api.hero;

import com.google.gson.annotations.SerializedName;

public class DotaAbilityUpgradeImpl implements DotaAbilityUpgrade {

    @SerializedName("ability")
    private final int mAbility;
    @SerializedName("time")
    private final int mTime;
    @SerializedName("level")
    private final int mLevel;


    public DotaAbilityUpgradeImpl(final int ability, final int time, final int level) {
        mAbility = ability;
        mTime = time;
        mLevel = level;
    }

    @Override
    public int getAbility() {
        return mAbility;
    }

    @Override
    public int getTime() {
        return mTime;
    }

    @Override
    public int getLevel() {
        return mLevel;
    }


}