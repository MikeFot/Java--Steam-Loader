package com.michaelfotiadis.steam.utils;

import java.util.regex.Pattern;

public class SteamIdUtils {

    private static final long CONSTANT = 76561197960265728L;

    private static final String EXPRESSION = "-?\\d+([.]\\d+)?";
    private static final Pattern PATTERN = Pattern.compile("-?\\d+([.]\\d+)?");


    public static boolean isNumeric(final String input) {
        return input != null && PATTERN.matcher(input).matches();
    }

    public static boolean isSteamId64(final long steamId) {
        return (steamId - CONSTANT) > 0;
    }

    public static boolean isSteamId64(final String steamId) {

        if (!isNumeric(steamId)) {
            return false;
        }

        final Long longId;

        try {
            longId = Long.parseLong(steamId);
        } catch (final Exception e) {
            return false;
        }

        return (longId - CONSTANT) > 0;
    }

    public static long steamId3toSteam64(final long steamId3) {
        return CONSTANT + steamId3;
    }

    public static long steamId64toSteamId3(final long steamId64) {
        return steamId64 - CONSTANT;
    }

    public static String getId64FromId3AsString(final String id3) {
        return isNumeric(id3) ? String.valueOf(steamId3toSteam64(Long.parseLong(id3))) : null;
    }

    public static String getId3FromId64AsString(final String id64) {
        return isNumeric(id64) ? String.valueOf(steamId64toSteamId3(Long.parseLong(id64))) : null;
    }

    public static String getId64FromString(final String id) {

        if (id == null || id.length() == 0) {
            return null;
        } else if (!isNumeric(id)) {
            return null;
        } else if (isSteamId64(id)) {
            return id;
        } else {
            return getId64FromId3AsString(id);
        }

    }

    public static String getId3FromString(final String id) {

        final String id64 = getId64FromString(id);
        return id64 != null ? getId3FromId64AsString(id64) : null;

    }

}