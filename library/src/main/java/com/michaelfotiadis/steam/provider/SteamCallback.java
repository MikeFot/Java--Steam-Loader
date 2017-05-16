package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.net.callback.Reason;

public interface SteamCallback<T> {

    void onSuccess(T result);

    void onError(Reason reason, int httpStatus);

}
