package com.michaelfotiadis.steam.data.steam.users.friends;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetFriendList">Wiki</a>
 */
public class Friend {

    @SerializedName("steamid")
    private final String steamId;
    @SerializedName("relationship")
    private final String relationship;
    @SerializedName("friend_since")
    private final Long friendSince;


    public Friend(final String steamId, final String relationship, final Long friendSince) {
        this.steamId = steamId;
        this.relationship = relationship;
        this.friendSince = friendSince;
    }

    /**
     * @return The 64 bit ID of the friend.
     */
    @Nonnull
    public String getSteamId() {
        return steamId;
    }

    /**
     * @return Role in relation to the given steamid
     */
    @Nonnull
    public String getRelationship() {
        return relationship;
    }

    /**
     * @return A unix timestamp of when the friend was added to the list.
     */
    @Nonnull
    public Long getFriendSince() {
        return friendSince;
    }
}