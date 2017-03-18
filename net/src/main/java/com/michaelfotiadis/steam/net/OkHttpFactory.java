package com.michaelfotiadis.steam.net;


import okhttp3.OkHttpClient;

public interface OkHttpFactory {

    OkHttpClient create(final Class<?> apiClass);

}
