package com.michaelfotiadis.steam.data.steam.users.friends;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetFriendList">Wiki</a>
 */
public class FriendsList {

    @SerializedName("friends")
    private final List<Friend> friends;

    public FriendsList(final List<Friend> friends) {
        this.friends = friends;
    }

    /**
     * @return A list of objects for each list entry.
     */
    @Nonnull
    public List<Friend> getFriends() {
        return friends;
    }
}