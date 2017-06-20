package com.michaelfotiadis.steam.data.steam.users.user;


import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;


/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetPlayerSummaries">Wiki</a>
 */
public class PlayerSummary implements SteamApiModel {

    @SerializedName("steamid")
    private final String SteamId;
    @SerializedName("communityvisibilitystate")
    private final Integer communityVisibilityState;
    @SerializedName("profilestate")
    private final Integer profileState;
    @SerializedName("personaname")
    private final String personaName;
    @SerializedName("lastlogoff")
    private final Long lastLogOff;
    @SerializedName("profileurl")
    private final String profileUrl;
    @SerializedName("avatar")
    private final String avatar;
    @SerializedName("avatarmedium")
    private final String avatarMedium;
    @SerializedName("avatarfull")
    private final String avatarFull;
    @SerializedName("personastate")
    private final Integer personaState;
    @SerializedName("commentpermission")
    private final String commentPermission;
    @SerializedName("realname")
    private final String realName;
    @SerializedName("primaryclanid")
    private final String primaryClanId;
    @SerializedName("timecreated")
    private final Long timeCreated;
    @SerializedName("personastateflags")
    private final Integer personaStateFlags;
    @SerializedName("loccountrycode")
    private final String locCountryCode;
    @SerializedName("locstatecode")
    private final String locStateCode;
    @SerializedName("loccityid")
    private final String locCityId;
    @SerializedName("gameid")
    private final String gameId;
    @SerializedName("gameextrainfo")
    private final String gameExtraInfo;
    @SerializedName("gameserverip")
    private final String gameServerIp;

    private PlayerSummary(final Builder builder) {
        SteamId = builder.SteamId;
        communityVisibilityState = builder.communityVisibilityState;
        profileState = builder.profileState;
        personaName = builder.personaName;
        lastLogOff = builder.lastLogOff;
        profileUrl = builder.profileUrl;
        avatar = builder.avatar;
        avatarMedium = builder.avatarMedium;
        avatarFull = builder.avatarFull;
        personaState = builder.personaState;
        commentPermission = builder.commentPermission;
        realName = builder.realName;
        primaryClanId = builder.primaryClanId;
        timeCreated = builder.timeCreated;
        personaStateFlags = builder.personaStateFlags;
        locCountryCode = builder.locCountryCode;
        locStateCode = builder.locStateCode;
        locCityId = builder.locCityId;
        gameId = builder.gameId;
        gameExtraInfo = builder.gameExtraInfo;
        gameServerIp = builder.gameServerIp;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @return The user's 64 bit ID
     */

    public String getSteamId() {
        return SteamId;
    }


    /**
     * @return A 32x32 image
     */

    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return An integer that describes the access setting of the profile
     * 1
     * Private
     * 2
     * Friends only
     * 3
     * Friends of Friends[1]
     * 4
     * Users Only
     * 5
     * Public
     */

    public Integer getCommunityVisibilityState() {
        return this.communityVisibilityState;
    }


    public CommunityVisibilityState getCommunityVisibilityStateAsEnum() {
        return CommunityVisibilityState.fromValue(this.communityVisibilityState);
    }

    /**
     * @return If set to 1 the user has configured the profile.
     */

    public Integer getProfileState() {
        return profileState;
    }

    /**
     * @return User's display name.
     */

    public String getPersonaName() {
        return personaName;
    }

    /**
     * @return A unix timestamp of when the user was last online.
     */

    public Long getLastLogOff() {
        return lastLogOff;
    }

    /**
     * @return The URL to the user's Steam Community profile.
     */

    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * @return A 64x64 image
     */

    public String getAvatarMedium() {
        return this.avatarMedium;
    }

    /**
     * @return A 184x184 image
     */

    public String getAvatarFull() {
        return this.avatarFull;
    }

    /**
     * @return The user's status
     * 0
     * Offline (Also set when the profile is Private)
     * 1
     * Online
     * 2
     * Busy
     * 3
     * Away
     * 4
     * Snooze
     * 5
     * Looking to trade
     * 6
     * Looking to play
     */

    public Integer getPersonaState() {
        return personaState;
    }


    public PersonaState getPersonaStateAsEnum() {
        return PersonaState.fromValue(this.personaState);
    }

    /**
     * @return The 64 bit ID of the user's primary group.
     */

    public String getPrimaryClanId() {
        return primaryClanId;
    }

    /**
     * @return A unix timestamp of the date the profile was created.
     */

    public Long getTimeCreated() {
        return timeCreated;
    }

    public Integer getPersonaStateFlags() {
        return personaStateFlags;
    }

    /**
     * @return ISO 3166 code of where the user is located.
     */

    public String getLocCountryCode() {
        return locCountryCode;
    }

    /**
     * @return Variable length code representing the state the user is located in.
     */

    public String getLocStateCode() {
        return locStateCode;
    }

    /**
     * @return If present the profile allows public comments.
     */

    public String getCommentPermission() {
        return commentPermission;
    }

    /**
     * @return The user's real name.
     */

    public String getRealName() {
        return realName;
    }

    /**
     * @return An integer ID internal to Steam representing the user's city.
     */

    public String getLocCityId() {
        return locCityId;
    }

    /**
     * @return If the user is in game this will be set to it's app ID as a string.
     */

    public String getGameId() {
        return gameId;
    }

    /**
     * @return The title of the game.
     */

    public String getGameExtraInfo() {
        return gameExtraInfo;
    }

    /**
     * @return The server URL given as an IP address and port number separated by a colon, this will not be present or set to "0.0.0.0:0" if none is available.
     */

    public String getGameServerIp() {
        return gameServerIp;
    }

    public static final class Builder {
        private String SteamId;
        private Integer communityVisibilityState;
        private Integer profileState;
        private String personaName;
        private Long lastLogOff;
        private String profileUrl;
        private String avatar;
        private String avatarMedium;
        private String avatarFull;
        private Integer personaState;
        private String commentPermission;
        private String realName;
        private String primaryClanId;
        private Long timeCreated;
        private Integer personaStateFlags;
        private String locCountryCode;
        private String locStateCode;
        private String locCityId;
        private String gameId;
        private String gameExtraInfo;
        private String gameServerIp;

        private Builder() {
        }

        public Builder withSteamId(final String val) {
            SteamId = val;
            return this;
        }

        public Builder withCommunityVisibilityState(final Integer val) {
            communityVisibilityState = val;
            return this;
        }

        public Builder withProfileState(final Integer val) {
            profileState = val;
            return this;
        }

        public Builder withPersonaName(final String val) {
            personaName = val;
            return this;
        }

        public Builder withLastLogOff(final Long val) {
            lastLogOff = val;
            return this;
        }

        public Builder withProfileUrl(final String val) {
            profileUrl = val;
            return this;
        }

        public Builder withAvatar(final String val) {
            avatar = val;
            return this;
        }

        public Builder withAvatarMedium(final String val) {
            avatarMedium = val;
            return this;
        }

        public Builder withAvatarFull(final String val) {
            avatarFull = val;
            return this;
        }

        public Builder withPersonaState(final Integer val) {
            personaState = val;
            return this;
        }

        public Builder withCommentPermission(final String val) {
            commentPermission = val;
            return this;
        }

        public Builder withRealName(final String val) {
            realName = val;
            return this;
        }

        public Builder withPrimaryClanId(final String val) {
            primaryClanId = val;
            return this;
        }

        public Builder withTimeCreated(final Long val) {
            timeCreated = val;
            return this;
        }

        public Builder withPersonaStateFlags(final Integer val) {
            personaStateFlags = val;
            return this;
        }

        public Builder withLocCountryCode(final String val) {
            locCountryCode = val;
            return this;
        }

        public Builder withLocStateCode(final String val) {
            locStateCode = val;
            return this;
        }

        public Builder withLocCityId(final String val) {
            locCityId = val;
            return this;
        }

        public Builder withGameId(final String val) {
            gameId = val;
            return this;
        }

        public Builder withGameExtraInfo(final String val) {
            gameExtraInfo = val;
            return this;
        }

        public Builder withGameServerIp(final String val) {
            gameServerIp = val;
            return this;
        }

        public PlayerSummary build() {
            return new PlayerSummary(this);
        }
    }
}