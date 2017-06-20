package com.michaelfotiadis.steam.data.steam.users.user;

import com.michaelfotiadis.steam.data.steam.SteamApiModel;

/**
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
public enum PersonaState implements SteamApiModel {

    UNKNOWN(-1),
    OFFLINE_PRIVATE(0),
    ONLINE(1),
    BUSY(2),
    AWAY(3),
    SNOOZE(4),
    LOOKING_TO_TRADE(5),
    LOOKING_TO_PLAY(6);

    private final int value;

    PersonaState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PersonaState fromValue(final int value) {
        for (final PersonaState state : PersonaState.values()) {
            if (state.value == value) {
                return state;
            }
        }

        return UNKNOWN;
    }

}
