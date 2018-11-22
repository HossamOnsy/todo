package com.hossam.android.weatherfreakingapp.utils

import android.graphics.ColorSpace
import io.reactivex.Observable
import okhttp3.Response
import okhttp3.ResponseBody
import org.json.JSONArray
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WebServiceInterface {
    @GET("todos/")
    fun postData():
            Observable<ResponseBody>

}