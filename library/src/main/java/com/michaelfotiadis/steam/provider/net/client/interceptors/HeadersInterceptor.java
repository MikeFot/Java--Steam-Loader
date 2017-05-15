package com.michaelfotiadis.steam.provider.net.client.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeadersInterceptor implements Interceptor {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APPLICATION_JSON = "application/json";

    @Override
    public Response intercept(final Chain chain) throws IOException {
        final Request originalRequest = chain.request();
        final Request.Builder builder = originalRequest.newBuilder();
        builder.addHeader(CONTENT_TYPE, APPLICATION_JSON);

        return chain.proceed(builder.build());
    }
}