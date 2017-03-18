package com.michaelfotiadis.steam.dota2.loader.lib.model.enums;

/**
 */
public enum DotaLeaverStatus {

    //
    INVALID(-1, ""),
    NONE(0, ""),
    DISCONNECTED(1, "DC"),
    DISCONNECTED_TOO_LONG(2, "DC(>5min)"),
    ABANDONED(3, "Abandoned"),
    AFK(4, "AFK"),
    NEVER_CONNECTED(5, "Never Connected"),
    NEVER_CONNECTED_TOO_LONG(6, "Timed Out");

    private final int mValue;
    private final String mText;

    private DotaLeaverStatus(final int value, final String text) {
        this.mValue = value;
        this.mText = text;
    }

    public int getValue() {
        return mValue;
    }

    public static DotaLeaverStatus getType(final int value) {
        for (final DotaLeaverStatus status : DotaLeaverStatus.values()) {
            if (status.mValue == value) {
                return status;
            }
        }

        return INVALID;
    }

    public String getText() {
        return mText;
    }
}
