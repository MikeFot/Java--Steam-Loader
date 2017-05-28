package com.michaelfotiadis.steam.provider.dota;

import com.michaelfotiadis.steam.provider.base.ApiProvider;

public abstract class Dota2ApiProvider<D> extends ApiProvider<D> {

    protected static final String PROD_ENDPOINT_ID = "570";
    protected static final String DEV_ENDPOINT_ID = "205790";

    protected Dota2ApiProvider(final String key, final D api) {
        super(key, api);
    }
}
