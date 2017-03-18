package com.michaelfotiadis.steam.net.client.interceptors;

import java.io.IOException;
import java.net.SocketTimeoutException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RetryPolicyInterceptor implements Interceptor {
    private static final int HTTP_CODE_202 = 202;
    private static final long MAX_RETRY_TIME = 60 * 60 * 1000; // 1 minute
    private static final long SLEEP_TIME = 3 * 1000; // 3 seconds

    @Override
    public Response intercept(final Chain chain) throws IOException {

        final Request request = chain.request();
        final Response response;
        try {
            // try the call
            response = chain.proceed(request);

            //noinspection IfStatementWithNegatedCondition
            if (response.code() != HTTP_CODE_202) {
                return response;
            } else {
                response.body().close();
                return repeatRequest(chain, request);
            }
        } catch (final SocketTimeoutException e) {
            throw e;
        }
    }

    @SuppressWarnings("MethodMayBeStatic")
    private Response repeatRequest(final Chain chain, final Request authorisedRequest) throws IOException {

        Response repeatResponse = chain.proceed(authorisedRequest);

        final long startTime = System.currentTimeMillis();
        while (repeatResponse.code() == HTTP_CODE_202) {
            final long elapsedTime = System.currentTimeMillis() - startTime;
            if (elapsedTime > MAX_RETRY_TIME) {
                return chain.proceed(authorisedRequest);
            } else {
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (final InterruptedException e) {
                    //Do nothing.
                }
                repeatResponse = chain.proceed(authorisedRequest);
                //noinspection IfStatementWithNegatedCondition
                if (repeatResponse.code() != HTTP_CODE_202) {
                    return chain.proceed(authorisedRequest);
                } else {
                    chain.proceed(authorisedRequest);
                }
            }
        }

        return repeatResponse;
    }

}