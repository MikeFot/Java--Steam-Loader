package com.michaelfotiadis.steam.data.dota2.types;

public enum Series {

    UNKNOWN(-1, ""),
    NON_SERIES(0, "Non-series"), // 0	Non-series
    BEST_OF_3(1, "Best of 3"), // 1	Best of 3
    BEST_OF_5(2, "Best of 5"); // 2	Best of 5

    private final int value;
    private final String text;

    Series(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public static Series getType(final int value) {
        for (final Series mode : Series.values()) {
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
