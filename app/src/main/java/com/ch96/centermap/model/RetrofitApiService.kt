package com.ch96.centermap.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RetrofitApiService {


    @GET("centers")
    fun searchCenter(@Query("page")page:Int, @Query("perPage")perPage:Int, @Query("serviceKey")serviceKey:String):Call<ResponseModel>

}