package com.michaelfotiadis.steam.data.steam.player.badges;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetBadges">Wiki</a>
 */
public class Badge implements SteamApiModel {

    @SerializedName("badgeid")
    private final Integer badgeid;
    @SerializedName("level")
    private final Integer level;
    @SerializedName("completion_time")
    private final Integer completionTime;
    @SerializedName("xp")
    private final Integer xp;
    @SerializedName("scarcity")
    private final Integer scarcity;
    @SerializedName("appid")
    private final Integer appid;
    @SerializedName("communityitemid")
    private final String communityitemid;
    @SerializedName("border_color")
    private final Integer borderColor;

    /**
     * @return Badge ID. Currently no official badge schema is available.
     */
    public Integer getBadgeid() {
        return badgeid;
    }

    /**
     * @return *undocumented*
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @return Unix timestamp of when the steam user acquired the badge.
     */
    public Integer getCompletionTime() {
        return completionTime;
    }

    /**
     * @return The experience this badge is worth, contributing toward the steam account's player_xp.
     */
    public Integer getXp() {
        return xp;
    }

    /**
     * @return The amount of people who has this badge.
     */
    public Integer getScarcity() {
        return scarcity;
    }

    /**
     * @return (Optional)
     * Provided if the badge relates to an app (trading cards); the value doesn't seem to be an item in the steam accounts backpack, however the value minus 1 seems to be the item ID for the emoticon granted for crafting this badge, and the value minus 2 seems to be the background granted.
     */
    public String getCommunityitemid() {
        return communityitemid;
    }

    /**
     * @return (Optional)
     * Provided if the badge relates to an app (trading cards).
     */
    public Integer getBorderColor() {
        return borderColor;
    }

    /**
     * @return (Optional)
     * Provided if the badge relates to an app (trading cards).
     */
    public Integer getAppId() {
        return appid;
    }

    private Badge(final Builder builder) {
        badgeid = builder.badgeid;
        level = builder.level;
        completionTime = builder.completionTime;
        xp = builder.xp;
        scarcity = builder.scarcity;
        appid = builder.appid;
        communityitemid = builder.communityitemid;
        borderColor = builder.borderColor;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private Integer badgeid;
        private Integer level;
        private Integer completionTime;
        private Integer xp;
        private Integer scarcity;
        private Integer appid;
        private String communityitemid;
        private Integer borderColor;

        private Builder() {
        }

        public Builder withBadgeid(final Integer val) {
            badgeid = val;
            return this;
        }

        public Builder withLevel(final Integer val) {
            level = val;
            return this;
        }

        public Builder withCompletionTime(final Integer val) {
            completionTime = val;
            return this;
        }

        public Builder withXp(final Integer val) {
            xp = val;
            return this;
        }

        public Builder withScarcity(final Integer val) {
            scarcity = val;
            return this;
        }

        public Builder withAppid(final Integer val) {
            appid = val;
            return this;
        }

        public Builder withCommunityitemid(final String val) {
            communityitemid = val;
            return this;
        }

        public Builder withBorderColor(final Integer val) {
            borderColor = val;
            return this;
        }

        public Badge build() {
            return new Badge(this);
        }
    }
}