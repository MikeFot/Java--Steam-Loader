package com.michaelfotiadis.steam.net.callback;

public interface NetworkCallback<T> {

    void onResponse(final String url, final T payload, final boolean is2XX, final int httpStatus);

    void onFailure(final String url, Reason reason);

}
