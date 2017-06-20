package com.michaelfotiadis.steam.data.steam.users.friends;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.steam.SteamApiModel;

import java.util.List;

/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetFriendList">Wiki</a>
 */
public class FriendsList implements SteamApiModel {

    @SerializedName("friends")
    private final List<Friend> friends;

    public FriendsList(final List<Friend> friends) {
        this.friends = friends;
    }

    /**
     * @return A list of objects for each list entry.
     */

    public List<Friend> getFriends() {
        return friends;
    }
}