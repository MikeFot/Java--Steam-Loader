package com.michaelfotiadis.steam.dota2.loader.lib.model.api.steam;


import com.google.gson.annotations.SerializedName;

public class SteamAccountDetailsImpl implements SteamAccountDetails {

    @SerializedName("steamid")
    private final String mSteamId;
    @SerializedName("communityvisibilitystate")
    private final Integer mCommunityVisibilityState;
    @SerializedName("profilestate")
    private final Integer mProfileState;
    @SerializedName("personaname")
    private final String mPersonaName;
    @SerializedName("lastlogoff")
    private final Long mLastLogOff;
    @SerializedName("profileurl")
    private final String mProfileUrl;
    @SerializedName("avatar")
    private final String mAvatar;
    @SerializedName("avatarmedium")
    private final String mAvatarMedium;
    @SerializedName("avatarfull")
    private final String mAvatarFull;
    @SerializedName("personastate")
    private final Integer mPersonaState;
    @SerializedName("primaryclanid")
    private final String mPrimaryClanId;
    @SerializedName("timecreated")
    private final Integer mTimeCreated;
    @SerializedName("personastateflags")
    private final Integer mPersonaStateFlags;
    @SerializedName("loccountrycode")
    private final String mLocCountryCode;
    @SerializedName("locstatecode")
    private final String mLocStateCode;


    public SteamAccountDetailsImpl(final String steamId, final Integer communityVisibilityState, final Integer profileState, final String personaName, final Long lastLogOff, final String profileUrl, final String avatar, final String avatarMedium, final String avatarFull, final Integer personaState, final String primaryClanId, final Integer timeCreated, final Integer personaStateFlags, final String locCountryCode, final String locStateCode) {
        mSteamId = steamId;
        mCommunityVisibilityState = communityVisibilityState;
        mProfileState = profileState;
        mPersonaName = personaName;
        mLastLogOff = lastLogOff;
        mProfileUrl = profileUrl;
        mAvatar = avatar;
        mAvatarMedium = avatarMedium;
        mAvatarFull = avatarFull;
        mPersonaState = personaState;
        mPrimaryClanId = primaryClanId;
        mTimeCreated = timeCreated;
        mPersonaStateFlags = personaStateFlags;
        mLocCountryCode = locCountryCode;
        mLocStateCode = locStateCode;
    }

    @Override
    public String getSteamId() {
        return mSteamId;
    }

    @Override
    public String getAvatar() {
        return mAvatar;
    }

    @Override
    public Integer getCommunityVisibilityState() {
        return mCommunityVisibilityState;
    }

    @Override
    public Integer getProfileState() {
        return mProfileState;
    }

    @Override
    public String getPersonaName() {
        return mPersonaName;
    }

    @Override
    public Long getLastLogOff() {
        return mLastLogOff;
    }

    @Override
    public String getProfileUrl() {
        return mProfileUrl;
    }

    @Override
    public String getAvatarMedium() {
        return mAvatarMedium;
    }

    @Override
    public String getAvatarFull() {
        return mAvatarFull;
    }

    @Override
    public Integer getPersonaState() {
        return mPersonaState;
    }

    @Override
    public String getPrimaryClanId() {
        return mPrimaryClanId;
    }

    @Override
    public Integer getTimeCreated() {
        return mTimeCreated;
    }

    @Override
    public Integer getPersonaStateFlags() {
        return mPersonaStateFlags;
    }

    @Override
    public String getLocCountryCode() {
        return mLocCountryCode;
    }

    @Override
    public String getLocStateCode() {
        return mLocStateCode;
    }

}