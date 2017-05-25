package com.michaelfotiadis.steam.data.steam.users.bans;

import com.google.gson.annotations.SerializedName;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerBans">Wiki</a>
 */
public class PlayerBan {

    @SerializedName("SteamId")
    private final String steamId;
    @SerializedName("CommunityBanned")
    private final Boolean communityBanned;
    @SerializedName("VACBanned")
    private final Boolean vACBanned;
    @SerializedName("NumberOfVACBans")
    private final Integer numberOfVACBans;
    @SerializedName("DaysSinceLastBan")
    private final Integer daysSinceLastBan;
    @SerializedName("NumberOfGameBans")
    private final Integer numberOfGameBans;
    @SerializedName("EconomyBan")
    private final String economyBan;

    public PlayerBan(String steamId, Boolean communityBanned, Boolean vACBanned, Integer numberOfVACBans, Integer daysSinceLastBan, Integer numberOfGameBans, String economyBan) {
        this.steamId = steamId;
        this.communityBanned = communityBanned;
        this.vACBanned = vACBanned;
        this.numberOfVACBans = numberOfVACBans;
        this.daysSinceLastBan = daysSinceLastBan;
        this.numberOfGameBans = numberOfGameBans;
        this.economyBan = economyBan;
    }

    private PlayerBan(Builder builder) {
        steamId = builder.steamId;
        communityBanned = builder.communityBanned;
        vACBanned = builder.vACBanned;
        numberOfVACBans = builder.numberOfVACBans;
        daysSinceLastBan = builder.daysSinceLastBan;
        numberOfGameBans = builder.numberOfGameBans;
        economyBan = builder.economyBan;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return A string containing the player's 64 bit ID.
     */
    public String getSteamId() {
        return steamId;
    }

    /**
     * @return Boolean indicating whether or not the player is banned from Community
     */
    public Boolean getCommunityBanned() {
        return communityBanned;
    }

    /**
     * @return Boolean indicating whether or not the player has VAC bans on record.
     */
    public Boolean getVACBanned() {
        return vACBanned;
    }

    public Integer getNumberOfVACBans() {
        return numberOfVACBans;
    }

    public Integer getDaysSinceLastBan() {
        return daysSinceLastBan;
    }

    /**
     * @return Number of bans in games.
     */
    public Integer getNumberOfGameBans() {
        return numberOfGameBans;
    }

    /**
     * @return String containing the player's ban status in the economy. If the player has no bans on record the string will be "none", if the player is on probation it will say "probation", and so forth.
     */
    public String getEconomyBan() {
        return economyBan;
    }


    public static final class Builder {
        private String steamId;
        private Boolean communityBanned;
        private Boolean vACBanned;
        private Integer numberOfVACBans;
        private Integer daysSinceLastBan;
        private Integer numberOfGameBans;
        private String economyBan;

        private Builder() {
        }

        public Builder withSteamId(String val) {
            steamId = val;
            return this;
        }

        public Builder withCommunityBanned(Boolean val) {
            communityBanned = val;
            return this;
        }

        public Builder withVACBanned(Boolean val) {
            vACBanned = val;
            return this;
        }

        public Builder withNumberOfVACBans(Integer val) {
            numberOfVACBans = val;
            return this;
        }

        public Builder withDaysSinceLastBan(Integer val) {
            daysSinceLastBan = val;
            return this;
        }

        public Builder withNumberOfGameBans(Integer val) {
            numberOfGameBans = val;
            return this;
        }

        public Builder withEconomyBan(String val) {
            economyBan = val;
            return this;
        }

        public PlayerBan build() {
            return new PlayerBan(this);
        }
    }
}