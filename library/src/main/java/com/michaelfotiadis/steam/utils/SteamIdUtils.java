package com.michaelfotiadis.steam.utils;

public class SteamIdUtils {

    private static final long CONSTANT = 76561197960265728l;

    public static boolean isSteamId64(final long steamId) {
        return (steamId - CONSTANT) > 0;
    }

    public static long steamId3toSteam64(final long steamId3) {
        return CONSTANT + steamId3;
    }

    public static long steamId64toSteamId3(final long steamId64) {
        return steamId64 - CONSTANT;
    }
}