package com.michaelfotiadis.steam.net.callback;

public enum Reason {


    DESERIALIZATION,
    NETWORK_ISSUE,
    TIMEOUT,
    HTTP_CODE_NOT_2XX,
    INVALID_REQUEST_PARAMETERS,
    UNKNOWN
}
