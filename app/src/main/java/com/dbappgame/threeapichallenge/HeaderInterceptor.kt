package com.dbappgame.threeapichallenge

import okhttp3.Interceptor
import okhttp3.Response

/*class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest =
            request
                .newBuilder()
                .addHeader("x-api-key", "42bc54f9-b100-4dd2-9927-7d883e7b413e")
                .build()

        return chain.proceed(newRequest)
    }
}*/