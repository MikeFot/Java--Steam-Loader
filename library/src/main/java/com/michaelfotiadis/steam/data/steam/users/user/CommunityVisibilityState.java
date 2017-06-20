package com.michaelfotiadis.steam.data.steam.users.user;

/**
 * /**
 * Describes the access setting of the profile
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
public enum CommunityVisibilityState {

    UNKNOWN(0),
    PRIVATE(1),
    FRIENDS_ONLY(2),
    FRIENDS_OF_FRIENDS(3),
    USERS_ONLY(4),
    PUBLIC(5);

    private final int value;

    CommunityVisibilityState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CommunityVisibilityState fromValue(final int value) {
        for (final CommunityVisibilityState state : CommunityVisibilityState.values()) {
            if (state.value == value) {
                return state;
            }
        }

        return UNKNOWN;
    }

}
