package com.michaelfotiadis.steam.provider.net.callback;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;

public final class ReasonResolver {

    private ReasonResolver() {
    }

    public static Reason getReason(final Throwable t) {
        final Reason retVal;

        if (t instanceof SocketTimeoutException) {
            retVal = Reason.TIMEOUT;
        } else if (t instanceof EOFException) {
            retVal = Reason.DESERIALIZATION;
        } else if (t instanceof IOException) {
            retVal = Reason.NETWORK_ISSUE;
        } else {
            retVal = Reason.UNKNOWN;
        }

        return retVal;
    }

}
