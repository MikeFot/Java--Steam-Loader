package com.michaelfotiadis.steam.provider.image;

public enum Size {

    SMALL_HORIZONTAL("sb.png"),
    LARGE_HORIZONTAL("lg.png"),
    FULL_HORIZONTAL("full.png"),
    FULL_VERTICAL("vert.jpg");

    private final String text;

    Size(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return this.text;
    }

    public static Size fromString(final String text) {
        if (text == null || text.length() == 0) {
            return SMALL_HORIZONTAL;
        }
        for (final Size size : Size.values()) {
            if (size.toString().equals(text)) {
                return size;
            }
        }
        return SMALL_HORIZONTAL;

    }
}