package com.michaelfotiadis.steam.data.dota2.types;

/**
 * Game Mode Type
 * https://dota2api.readthedocs.io/en/latest/responses.html
 */
public enum GameMode {

    UNKNOWN(0, ""), // 0	Unknown
    ALL_PICK(1, "All Pick"), // 1	All Pick
    CAPTAINS_MODE(2, "Captain's Mode"), // 2	Captain’s Mode
    RANDOM_DRAFT(3, "Random Draft"), // 3	Random Draft
    SINGLE_DRAFT(4, "Single Draft"), // 4	Single Draft
    ALL_RANDOM(5, "All Random"), // 5	All Random
    INTRO_DEATH(6, "Intro"), // 6	Intro
    THE_DIRETIDE(7, "Diretide"), // 7	Diretide
    REVERSE_CAPTAINS_MODE(8, "Reverse Captain’s Mode"), // 8	Reverse Captain’s Mode
    GREEVILING(9, "The Greeviling"), // 9	The Greeviling
    TUTORIAL(10, "Tutorial"), // 10	Tutorial
    MID_ONLY(11, "Mid Only"), // 11	Mid Only
    LEAST_PLAYED(12, "Least Played"), // 12	Least Played
    NEW_PLAYER_POOL(13, "New Player Pool"), // 13	New Player Pool
    COMPENDIUM_MATCHING(14, "Compendium Matching"), // 14	Compendium Matchmaking
    CUSTOM(15, "Custom"), // 15	Custom
    CAPTAINS_DRAFT(16, "Captain's Draft"), // 16	Captains Draft
    BALANCED_DRAFT(17, "Balanced Draft"), // 17	Balanced Draft
    ABILITY_DRAFT(18, "Ability Draft"), // 18	Ability Draft
    EVENT(19, "Event"), // 19	Event (?)
    ALL_RANDOM_DEATH_MATCH(20, "All Random Death Match"), // 20	All Random Death Match
    ONEVSONE_SOLO_MID(21, "Solo Mid 1 vs 1"), // 21	Solo Mid 1 vs 1
    ALL_DRAFT(22, "Ranked All Pick"); // 22	Ranked All Pick


    private final int value;
    private final String text;

    private GameMode(final int value, final String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public static GameMode getType(final int value) {
        for (final GameMode mode : GameMode.values()) {
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