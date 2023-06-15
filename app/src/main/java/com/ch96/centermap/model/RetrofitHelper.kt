package com.ch96.centermap.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitHelper {
    companion object {
        fun getRetrofitInstanse(baseUrl:String):Retrofit{
            val retrofit = Retrofit.Builder()
                           .baseUrl(baseUrl)
                           .addConverterFactory(ScalarsConverterFactory.create())
                           .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit
        }
    }
}