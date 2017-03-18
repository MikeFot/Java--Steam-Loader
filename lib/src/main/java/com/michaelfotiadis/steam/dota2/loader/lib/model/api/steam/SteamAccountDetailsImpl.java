package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.google.gson.annotations.SerializedName;

public class SteamAccountDetailsImpl implements SteamAccountDetails {

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
    @SerializedName("primaryclanid")
    private final String primaryClanId;
    @SerializedName("timecreated")
    private final Integer timeCreated;
    @SerializedName("personastateflags")
    private final Integer personaStateFlags;
    @SerializedName("loccountrycode")
    private final String locCountryCode;
    @SerializedName("locstatecode")
    private final String locStateCode;


    public SteamAccountDetailsImpl(final String steamId, final Integer communityVisibilityState, final Integer profileState, final String personaName, final Long lastLogOff, final String profileUrl, final String avatar, final String avatarMedium, final String avatarFull, final Integer personaState, final String primaryClanId, final Integer timeCreated, final Integer personaStateFlags, final String locCountryCode, final String locStateCode) {
        SteamId = steamId;
        this.communityVisibilityState = communityVisibilityState;
        this.profileState = profileState;
        this.personaName = personaName;
        this.lastLogOff = lastLogOff;
        this.profileUrl = profileUrl;
        this.avatar = avatar;
        this.avatarMedium = avatarMedium;
        this.avatarFull = avatarFull;
        this.personaState = personaState;
        this.primaryClanId = primaryClanId;
        this.timeCreated = timeCreated;
        this.personaStateFlags = personaStateFlags;
        this.locCountryCode = locCountryCode;
        this.locStateCode = locStateCode;
    }

    @Override
    public String getSteamId() {
        return SteamId;
    }

    @Override
    public String getAvatar() {
        return this.avatar;
    }

    @Override
    public Integer getCommunityVisibilityState() {
        return this.communityVisibilityState;
    }

    @Override
    public Integer getProfileState() {
        return profileState;
    }

    @Override
    public String getPersonaName() {
        return personaName;
    }

    @Override
    public Long getLastLogOff() {
        return lastLogOff;
    }

    @Override
    public String getProfileUrl() {
        return profileUrl;
    }

    @Override
    public String getAvatarMedium() {
        return this.avatarMedium;
    }

    @Override
    public String getAvatarFull() {
        return this.avatarFull;
    }

    @Override
    public Integer getPersonaState() {
        return personaState;
    }

    @Override
    public String getPrimaryClanId() {
        return primaryClanId;
    }

    @Override
    public Integer getTimeCreated() {
        return timeCreated;
    }

    @Override
    public Integer getPersonaStateFlags() {
        return personaStateFlags;
    }

    @Override
    public String getLocCountryCode() {
        return locCountryCode;
    }

    @Override
    public String getLocStateCode() {
        return locStateCode;
    }

}