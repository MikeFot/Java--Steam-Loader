package com.michaelfotiadis.steam.data.steam.users.friends;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.SteamApiModel;



/**
 * @see <a href="https://wiki.teamfortress.com/wiki/WebAPI/GetFriendList">Wiki</a>
 */
public class FriendsListResponse implements SteamApiModel {

    @SerializedName("friendslist")
    private final FriendsList friendsList;

    public FriendsListResponse(final FriendsList friendsList) {
        this.friendsList = friendsList;
    }

    /**
     * @return f the profile is not public or there are no available entries for the given relationship only an empty object will be returned.
     */

    public FriendsList getFriendsList() {
        return friendsList;
    }
}