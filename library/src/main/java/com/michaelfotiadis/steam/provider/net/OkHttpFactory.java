package com.michaelfotiadis.steam.provider.net;


import okhttp3.OkHttpClient;

public interface OkHttpFactory {

    OkHttpClient create(final Class<?> apiClass);

}
