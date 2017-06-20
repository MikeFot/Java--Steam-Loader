package com.michaelfotiadis.steam.data.steam.player.badges;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetBadges">Wiki</a>
 */
public class Badges implements SteamApiModel {

    @SerializedName("badges")
    private final List<Badge> badges;
    @SerializedName("player_xp")
    private final Integer playerXp;
    @SerializedName("player_level")
    private final Integer playerLevel;
    @SerializedName("player_xp_needed_to_level_up")
    private final Integer playerXpNeededToLevelUp;
    @SerializedName("player_xp_needed_current_level")
    private final Integer playerXpNeededCurrentLevel;

    /**
     * @return Array of badges
     */
    public List<Badge> getBadges() {
        return badges;
    }

    /**
     * @return *undocumented*
     */
    public Integer getPlayerXp() {
        return playerXp;
    }

    /**
     * @return *undocumented*
     */
    public Integer getPlayerLevel() {
        return playerLevel;
    }

    /**
     * @return *undocumented*
     */
    public Integer getPlayerXpNeededToLevelUp() {
        return playerXpNeededToLevelUp;
    }

    /**
     * @return *undocumented*
     */
    public Integer getPlayerXpNeededCurrentLevel() {
        return playerXpNeededCurrentLevel;
    }

    private Badges(final Builder builder) {
        badges = builder.badges;
        playerXp = builder.playerXp;
        playerLevel = builder.playerLevel;
        playerXpNeededToLevelUp = builder.playerXpNeededToLevelUp;
        playerXpNeededCurrentLevel = builder.playerXpNeededCurrentLevel;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private List<Badge> badges;
        private Integer playerXp;
        private Integer playerLevel;
        private Integer playerXpNeededToLevelUp;
        private Integer playerXpNeededCurrentLevel;

        private Builder() {
        }

        public Builder withBadges(final List<Badge> val) {
            badges = val;
            return this;
        }

        public Builder withPlayerXp(final Integer val) {
            playerXp = val;
            return this;
        }

        public Builder withPlayerLevel(final Integer val) {
            playerLevel = val;
            return this;
        }

        public Builder withPlayerXpNeededToLevelUp(final Integer val) {
            playerXpNeededToLevelUp = val;
            return this;
        }

        public Builder withPlayerXpNeededCurrentLevel(final Integer val) {
            playerXpNeededCurrentLevel = val;
            return this;
        }

        public Badges build() {
            return new Badges(this);
        }
    }
}