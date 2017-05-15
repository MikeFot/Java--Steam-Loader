package com.michaelfotiadis.steam.provider.net.callback;

import retrofit2.Call;
import retrofit2.Callback;

public final class Retrofit2CallbackFactory {


    private Retrofit2CallbackFactory() {
        // NOOP
    }

    public static <T> Callback<T> create(final NetworkCallback<T> callback) {
        return new Callback<T>() {
            @Override
            public void onResponse(final Call<T> call, final retrofit2.Response<T> response) {
                final String url = call.request().url().toString();

                final T payload = response.body();
                final boolean is2XX = response.isSuccessful();
                final int code = response.code();

                callback.onResponse(url, payload, is2XX, code);
            }

            @Override
            public void onFailure(final Call<T> call, final Throwable t) {
                final String url = call.request().url().toString();
                final Reason reason = ReasonResolver.getReason(t);
                callback.onFailure(url, reason);
            }
        };
    }


}
