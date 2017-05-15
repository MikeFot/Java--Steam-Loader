package com.michaelfotiadis.steam.data.dota2.types;

public enum LeagueTier {

    UNKNOWN(0, ""),
    AMATEUR(1, "Amateur"), // 1	Amateur
    PROFESSIONAL(2, "Professional"), // 2	Professional
    PREMIER(3, "Premier"); // 3	Premier

    private final int value;
    private final String text;

    LeagueTier(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public static LeagueTier getType(final int value) {
        for (final LeagueTier mode : LeagueTier.values()) {
            if (mode.value == value) {
                return mode;
            }
        }

        return UNKNOWN;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

}
