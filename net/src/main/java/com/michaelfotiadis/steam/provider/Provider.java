package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.net.callback.NetworkCallback;
import com.michaelfotiadis.steam.net.callback.Reason;
import com.michaelfotiadis.steam.net.callback.Retrofit2CallbackFactory;

import retrofit2.Call;

/*package*/ abstract class Provider<D> {

    private final String key;
    private final D api;

    Provider(final String key, final D api) {
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

    protected static class WrappedCallback<T> implements NetworkCallback<T> {
        private final SteamCallback<T> mCallback;

        protected WrappedCallback(final SteamCallback<T> callback) {
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
