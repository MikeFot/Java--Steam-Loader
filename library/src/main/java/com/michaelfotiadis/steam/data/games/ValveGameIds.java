package com.michaelfotiadis.steam.data.games;


public enum ValveGameIds {

    COUNTER_STRIKE_SOURCE_BETA("260"),
    TEAM_FORTRESS_2("440"),
    TEAM_FORTRESS_2_PUBLIC_BETA("520"),
    DOTA_2("570"),
    PORTAL_2("620"),
    COUNTER_STRIKE_GO_BETA_DEV("710"),
    DOTA_2_INTERNAL_TEST("816"),
    PORTAL_2_BETA("841"),
    DOTA_2_BETA("205790");

    private final String value;

    ValveGameIds(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
