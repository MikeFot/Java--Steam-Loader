package com.michaelfotiadis.steam.data;

public enum FileFormat {

    JSON("json"),
    XML("xml"),
    VALVE_DATA_FORMAT("vdf");

    private final String text;

    FileFormat(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
