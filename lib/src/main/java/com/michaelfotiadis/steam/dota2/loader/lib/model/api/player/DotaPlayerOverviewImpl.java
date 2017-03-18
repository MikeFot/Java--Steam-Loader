package com.michaelfotiadis.steam.dota2.loader.lib.model.api.player;

import com.google.gson.annotations.SerializedName;

public class DotaPlayerOverviewImpl implements DotaPlayerOverview {

    @SerializedName("account_id")
    private final Long mAccountId;
    @SerializedName("player_slot")
    private final Integer mPlayerSlot;
    @SerializedName("hero_id")
    private final Integer mHeroId;

    public DotaPlayerOverviewImpl(final Long accountId, final Integer playerSlot, final Integer heroId) {
        mAccountId = accountId;
        mPlayerSlot = playerSlot;
        mHeroId = heroId;
    }

    @Override
    public Long getAccountId() {
        return mAccountId;
    }

    @Override
    public Integer getPlayerSlot() {
        return mPlayerSlot;
    }

    @Override
    public Integer getHeroId() {
        return mHeroId;
    }

}