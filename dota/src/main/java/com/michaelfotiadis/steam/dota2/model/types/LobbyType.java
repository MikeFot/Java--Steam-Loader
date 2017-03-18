package com.michaelfotiadis.steam.dota2.model.types;

/**
 * Lobby Type
 * https://dota2api.readthedocs.io/en/latest/responses.html
 */
public enum LobbyType {

    INVALID(-1, ""), // -1	Invalid
    PUBLIC_MATCHMAKING(0, "Public matchmaking"), // 0 Public matchmaking
    PRACTICE(1, "Practice"), // 1	Practice
    TOURNAMENT(2, "Tournament"), // 2	Tournament
    TUTORIAL(3, "Tutorial"), // 3	Tutorial
    COOP_WITH_BOTS(4, "Co-op with AI"), // 4	Co-op with AI
    TEAM_MATCH(5, "Team Match"), // 5	Team match
    SOLO_QUEUE(6, "Solo Queue"), // 6	Solo queue
    RANKED(7, "Ranked Matchmaking"), // 7	Ranked matchmaking
    SOLO_MID_ONEVSONE(8, "Solo Mid 1 vs 1"); // 8	Solo Mid 1 vs 1

    private final int value;
    private final String text;

    private LobbyType(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public static LobbyType getType(final int value) {
        for (final LobbyType mode : LobbyType.values()) {
            if (mode.value == value) {
                return mode;
            }
        }

        return INVALID;
    }

    public String getText() {
        return text;
    }
}