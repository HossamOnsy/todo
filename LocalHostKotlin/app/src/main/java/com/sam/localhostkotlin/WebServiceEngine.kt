package com.hossam.android.weatherfreakingapp.utils

import android.content.Context
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory


class WebServiceEngine() {

companion object {
    val BASE_URL: String = "http://192.168.1.5:3000/"
    fun getRetrofit(c : Context): WebServiceInterface {

        val interceptor =  HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        val httpClient = OkHttpClient().newBuilder().addInterceptor(interceptor).build()
        val r = retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        return r.create(WebServiceInterface::class.java)
    }
}
}