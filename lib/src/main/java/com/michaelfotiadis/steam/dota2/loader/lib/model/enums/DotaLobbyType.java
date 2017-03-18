package com.michaelfotiadis.steam.dota2.loader.lib.model.enums;

public enum DotaLobbyType {

    INVALID(-1, ""),
    PUBLIC_MATCHMAKING(0, "Public"),
    PRACTICE(1, "Practice"),
    TOURNAMENT(2, "Tournament"),
    TUTORIAL(3, "Tutorial"),
    COOP_WITH_BOTS(4, "Coop with Bots"),
    TEAM_MATCH(5, "Team Match"),
    SOLO_QUEUE(6, "Solo Queue"),
    RANKED(7, "Ranked"),
    SOLO_MID_ONEVSONE(8, "Solo Mid");

    private final int mValue;
    private final String mText;

    private DotaLobbyType(final int value, final String text) {
        this.mValue = value;
        this.mText = text;
    }

    public int getValue() {
        return mValue;
    }

    public static DotaLobbyType getType(final int value) {
        for (final DotaLobbyType mode : DotaLobbyType.values()) {
            if (mode.mValue == value) {
                return mode;
            }
        }

        return INVALID;
    }

    public String getText() {
        return mText;
    }
}