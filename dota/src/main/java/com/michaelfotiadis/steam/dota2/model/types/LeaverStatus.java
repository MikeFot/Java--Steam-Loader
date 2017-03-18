package com.michaelfotiadis.steam.dota2.model.types;

/**
 * Leaver Status Type
 * https://dota2api.readthedocs.io/en/latest/responses.html
 */
public enum LeaverStatus {

    //
    INVALID(-1, "", ""),
    NONE(0, "NONE", "finished match, no abandon"), // 0	NONE	finished match, no abandon
    DISCONNECTED(1, "DISCONNECTED", "player DC, no abandon"), // 1 DISCONNECTED	player DC, no abandon
    DISCONNECTED_TOO_LONG(2, "DISCONNECTED_TOO_LONG", "DC > 5min, abandon"), // 2 DISCONNECTED_TOO_LONG	player DC > 5min, abandon
    ABANDONED(3, "ABANDONED", "player dc, clicked leave, abandon"), // 3	ABANDONED	player dc, clicked leave, abandon
    AFK(4, "AFK", "abandon"), // 4	AFK	player AFK, abandon
    NEVER_CONNECTED(5, "NEVER_CONNECTED", "never connected, no abandon"), // 5	NEVER_CONNECTED	never connected, no abandon
    NEVER_CONNECTED_TOO_LONG(6, "NEVER_CONNECTED_TOO_LONG", "too long to connect, no abandon"); // 6	NEVER_CONNECTED_TOO_LONG	too long to connect, no abandon

    private final int value;
    private final String text;
    private final String description;

    private LeaverStatus(final int value, final String text, final String description) {
        this.value = value;
        this.text = text;
        this.description = description;
    }

    public static LeaverStatus getType(final int value) {
        for (final LeaverStatus status : LeaverStatus.values()) {
            if (status.value == value) {
                return status;
            }
        }

        return INVALID;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public String getText() {
        return text;
    }
}
