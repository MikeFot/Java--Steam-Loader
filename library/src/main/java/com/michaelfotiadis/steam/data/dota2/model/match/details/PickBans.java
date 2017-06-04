package com.michaelfotiadis.steam.data.dota2.model.match.details;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;
import com.michaelfotiadis.steam.data.dota2.types.PickType;

public class PickBans implements DotaApiModel {

    @SerializedName("is_pick")
    private final Boolean isPick;
    @SerializedName("hero_id")
    private final String heroId;
    @SerializedName("team")
    private final Integer team;
    @SerializedName("order")
    private final Integer orderOfPickOrBan;

    public PickBans(final Boolean isPick, final String heroId, final Integer team, final Integer orderOfPickOrBan) {
        this.isPick = isPick;
        this.heroId = heroId;
        this.team = team;
        this.orderOfPickOrBan = orderOfPickOrBan;
    }

    /**
     * @return Whether this entry is a pick (true) or a ban (false).
     */
    public Boolean isPick() {
        return isPick;
    }

    /**
     * @return PickType as enum, unknown if it cannot be resolved
     */
    public PickType isPickAsEnum() {
        if (isPick != null) {
            return isPick ? PickType.PICK : PickType.BAN;
        } else {
            return PickType.UNKNOWN;
        }
    }

    /**
     * @return The hero's unique ID. A list of hero IDs can be found via the GetHeroes method.
     */
    public String getHeroId() {
        return heroId;
    }

    /**
     * @return The team who chose the pick or ban; 0 for Radiant, 1 for Dire.
     */
    public Integer getTeam() {
        return team;
    }

    /**
     * @return The order of which the picks and bans were selected; 0-19.
     */
    public Integer getOrderOfPickOrBan() {
        return orderOfPickOrBan;
    }
}
