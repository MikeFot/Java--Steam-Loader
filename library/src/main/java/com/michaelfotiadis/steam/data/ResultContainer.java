package com.michaelfotiadis.steam.data;

import com.google.gson.annotations.SerializedName;

public class ResultContainer<T> {

    @SerializedName("result")
    private final T result;

    public ResultContainer(final T result) {
        this.result = result;
    }

    public T getResult() {
        return this.result;
    }

}
