package com.michaelfotiadis.steam.data.steam.player.quests;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetCommunityBadgeProgress">Wiki</a>
 */
public class Quest implements SteamApiModel {

    @SerializedName("questid")
    private final Integer questid;
    @SerializedName("completed")
    private final Boolean completed;

    public Quest(final Integer questid, final Boolean completed) {
        this.questid = questid;
        this.completed = completed;
    }

    /**
     * @return Quest ID; no schema is currently available.
     */
    public Integer getQuestid() {
        return questid;
    }

    /**
     * @return Whether the steam account has completed this quest.
     */
    public Boolean getCompleted() {
        return completed;
    }
}