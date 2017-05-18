package com.michaelfotiadis.steam.data;

import com.google.gson.annotations.SerializedName;

public class ResponseContainer<T> {

    @SerializedName("response")
    private final T response;

    public ResponseContainer(final T response) {
        this.response = response;
    }

    public T getResponse() {
        return this.response;
    }

}
