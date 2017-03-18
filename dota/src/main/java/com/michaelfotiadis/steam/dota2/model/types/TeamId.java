package com.michaelfotiadis.steam.dota2.model.types;

public enum TeamId {

    UNKNOWN(-1, ""),
    RADIANT(0, "Radiant"),  // 0	Radiant
    DIRE(1, "Dire"), // 1	Dire
    BROADCASTER(2, "Broadcaster"), // 2	Broadcaster
    UNASSIGNED(3, "Unassigned (?)"); // 3+	Unassigned (?)

    private final int value;
    private final String text;

    TeamId(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public static TeamId getType(final int value) {
        for (final TeamId mode : TeamId.values()) {
            if (mode.value == value) {
                return mode;
            }
        }

        return value >= UNASSIGNED.getValue() ? UNASSIGNED : UNKNOWN;
    }

    public String getText() {
        return text;
    }

}
