package com.michaelfotiadis.steam.dota2.model.api.player;

import com.google.gson.annotations.SerializedName;

public class PlayerOverviewImpl implements PlayerOverview {

    @SerializedName("account_id")
    private final Long accountId;
    @SerializedName("player_slot")
    private final Integer playerSlot;
    @SerializedName("hero_id")
    private final Integer heroId;

    public PlayerOverviewImpl(final Long accountId, final Integer playerSlot, final Integer heroId) {
        this.accountId = accountId;
        this.playerSlot = playerSlot;
        this.heroId = heroId;
    }

    @Override
    public Long getAccountId() {
        return this.accountId;
    }

    @Override
    public Integer getPlayerSlot() {
        return playerSlot;
    }

    @Override
    public Integer getHeroId() {
        return heroId;
    }

}