package com.michaelfotiadis.steam.dota2.loader.lib.model.enums;

public enum DotaGameMode {
    UNKNOWN(0, ""),
    ALL_PICK(1, "All Pick"),
    CAPTAINS_MODE(2, "Captain's Mode"),
    RANDOM_DRAFT(3, "Random Draft"),
    SINGLE_DRAFT(4, "Single Draft"),
    ALL_RANDOM(5, "All Random"),
    INTRO_DEATH(6, "Intro Death"),
    THE_DIRETIDE(7, "The Diretide"),
    REVERSE_CAPTAINS_MODE(8, "Captain's Mode (R)"),
    GREEVILING(9, "Greeviling"),
    TUTORIAL(10, "Tutorial"),
    MID_ONLY(11, "Mid Only"),
    LEAST_PLAYED(12, "Least Played"),
    NEW_PLAYER_POOL(13, "New Player Pool"),
    COMPENDIUM_MATCHING(14, "Compendium Matching"),
    CUSTOM(15, "Custom"),
    CAPTAINS_DRAFT(16, "Captain's Draft"),
    BALANCED_DRAFT(17, "Balanced Draft"),
    ABILITY_DRAFT(18, "Ability Draft"),
    EVENT(19, "Event"),
    ALL_RANDOM_DEATH_MATCH(20, "Random Death Match"),
    ONEVSONE_SOLO_MID(21, "Solo Mid"),
    ALL_DRAFT(22, "All Draft");

    private final int mValue;
    private final String mText;

    private DotaGameMode(final int value, final String text) {
        this.mValue = value;
        this.mText = text;
    }

    public int getValue() {
        return mValue;
    }

    public static DotaGameMode getType(final int value) {
        for (final DotaGameMode mode : DotaGameMode.values()) {
            if (mode.mValue == value) {
                return mode;
            }
        }

        return UNKNOWN;
    }

    public String getText() {
        return mText;
    }
}