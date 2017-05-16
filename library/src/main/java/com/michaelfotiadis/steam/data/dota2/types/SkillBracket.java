package com.michaelfotiadis.steam.data.dota2.types;

public enum SkillBracket {

    UNKNOWN(-1, ""), // 0	Unknown
    ANY(0, "All Pick"), // 1	All Pick
    NORMAL(1, "Captain's Mode"), // 2	Captain’s Mode
    HIGH(2, "Random Draft"), // 3	Random Draft
    VERY_HIGH(3, "Single Draft"); // 4	Single Draft


    private final int value;
    private final String text;

    private SkillBracket(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public static SkillBracket getType(final int value) {
        for (final SkillBracket mode : SkillBracket.values()) {
            if (mode.value == value) {
                return mode;
            }
        }

        return UNKNOWN;
    }

    public String getText() {
        return text;
    }

}
