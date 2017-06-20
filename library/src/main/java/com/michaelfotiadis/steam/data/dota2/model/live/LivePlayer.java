package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.dota2.model.DotaApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetLiveLeagueGames">Wiki</a>
 */
public class LivePlayer implements DotaApiModel {

    @SerializedName("account_id")
    private final Integer accountId;
    @SerializedName("name")
    private final String name;
    @SerializedName("hero_id")
    private final Integer heroId;
    @SerializedName("team")
    private final Integer team;

    public LivePlayer(final Integer accountId, final String name, final Integer heroId, final Integer team) {
        this.accountId = accountId;
        this.name = name;
        this.heroId = heroId;
        this.team = team;
    }

    /**
     * @return 32-bit account ID.
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @return The player's display name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The hero's unique ID. A list of hero IDs can be found via the GetHeroes method.
     */
    public Integer getHeroId() {
        return heroId;
    }

    /**
     * @return What team the player is currently playing as.
     * 0 - Radiant
     * 1 - Dire
     * 2 - Broadcaster
     * 4 - Unassigned
     */
    public Integer getTeam() {
        return team;
    }
}