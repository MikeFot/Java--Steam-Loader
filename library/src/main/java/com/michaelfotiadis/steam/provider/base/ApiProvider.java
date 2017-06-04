package com.michaelfotiadis.steam.provider.base;

import com.michaelfotiadis.steam.net.callback.NetworkCallback;
import com.michaelfotiadis.steam.net.callback.Reason;
import com.michaelfotiadis.steam.net.callback.Retrofit2CallbackFactory;
import com.michaelfotiadis.steam.provider.SteamCallback;
import com.michaelfotiadis.steam.utils.SteamIdUtils;

import retrofit2.Call;

public abstract class ApiProvider<D> {

    private final String key;
    private final D api;

    protected ApiProvider(final String key, final D api) {
        this.key = key;
        this.api = api;
    }

    protected String getKey() {
        return key;
    }

    protected D getApi() {
        return api;
    }

    protected <T> void execAsync(final Call<T> call,
                                 final NetworkCallback<T> callback) {

        call.enqueue(Retrofit2CallbackFactory.create(callback));

    }

    protected static String sanitiseId64(final String id) {
        if (SteamIdUtils.isSteamId64(Long.parseLong(id))) {
            return id;
        } else {
            return String.valueOf(SteamIdUtils.steamId3toSteam64(Long.parseLong(id)));
        }
    }

    protected static String sanitiseId3(final String id) {
        final String id3;
        //noinspection IfMayBeConditional
        if (SteamIdUtils.isSteamId64(id)) {
            id3 = String.valueOf(SteamIdUtils.steamId64toSteamId3(Long.parseLong(id)));
        } else {
            id3 = id;
        }
        return id3;
    }

    protected static Integer conditionalToInteger(final Boolean conditional) {
        final Integer value;
        if (conditional == null) {
            value = null;
        } else {
            value = conditional ? 1 : 0;
        }
        return value;
    }

    protected static class WrappedCallback<T> implements NetworkCallback<T> {
        private final SteamCallback<T> mCallback;

        public WrappedCallback(final SteamCallback<T> callback) {
            mCallback = callback;
        }

        @Override
        public void onResponse(final String url, final T payload, final boolean is2XX, final int httpStatus) {

            if (is2XX && payload != null) {
                mCallback.onSuccess(payload);
            } else {
                mCallback.onError(Reason.HTTP_CODE_NOT_2XX, httpStatus);
            }

        }

        @Override
        public void onFailure(final String url, final Reason reason) {
            mCallback.onError(reason, 0);
        }
    }

}
