package com.michaelfotiadis.steam.data.dota2.model.player;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

public class PlayerOverview implements DotaApiModel {

    @SerializedName("account_id")
    private final Long accountId;
    @SerializedName("player_slot")
    private final Integer playerSlot;
    @SerializedName("hero_id")
    private final Integer heroId;

    public PlayerOverview(final Long accountId, final Integer playerSlot, final Integer heroId) {
        this.accountId = accountId;
        this.playerSlot = playerSlot;
        this.heroId = heroId;
    }

    /**
     * @return 32-bit account ID.
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     *
     * @return A player's slot is returned via an 8-bit unsigned integer. The first bit represent the player's team, false if Radiant and true if dire. The final three bits represent the player's position in that team, from 0-4.
     */
    public Integer getPlayerSlot() {
        return playerSlot;
    }

    /**
     *
     * @return The hero's unique ID. A list of hero IDs can be found via the GetHeroes method.
     */
    public Integer getHeroId() {
        return heroId;
    }

}