package com.michaelfotiadis.steam.net;


import com.michaelfotiadis.steam.net.client.interceptors.HeadersInterceptor;
import com.michaelfotiadis.steam.net.client.interceptors.RetryPolicyInterceptor;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpFactoryImpl implements OkHttpFactory {

    private final boolean enableDebug;

    public OkHttpFactoryImpl(final boolean enableDebug) {
        this.enableDebug = enableDebug;
    }

    public OkHttpClient create(final Class<?> clazz) {
        /**
         * This is important to avoid using a {@link TokenManager} in {@link LoginApi}
         * as the job of the {@link TokenManager} is to use the {@link LoginApi} to
         * refresh the token.
         */
        final List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new HeadersInterceptor());
        interceptors.add(new RetryPolicyInterceptor());
        interceptors.add(createLoggingInterceptor());

        return createClient(interceptors);
    }

    private OkHttpClient createClient(final List<Interceptor> interceptors) {
        final OkHttpClient.Builder builder = new OkHttpClient.Builder();

        for (final Interceptor interceptor : interceptors) {
            builder.addInterceptor(interceptor);
        }

        return builder.build();
    }

    private Interceptor createLoggingInterceptor() {
        final HttpLoggingInterceptor.Level level = enableDebug ? HttpLoggingInterceptor.Level.BASIC : HttpLoggingInterceptor.Level.NONE;

        final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(level);

        return interceptor;
    }
}
