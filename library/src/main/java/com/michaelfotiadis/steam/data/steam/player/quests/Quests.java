package com.michaelfotiadis.steam.data.steam.player.quests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetCommunityBadgeProgress">Wiki</a>
 */
public class Quests implements SteamApiModel {

    @SerializedName("quests")
    @Expose
    private final List<Quest> quests;

    public Quests(final List<Quest> quests) {
        this.quests = quests;
    }

    /**
     * @return Array of quests (actions required to unlock a badge)
     */
    public List<Quest> getQuests() {
        return quests;
    }
}