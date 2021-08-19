package com.example.cleanexceptionlib.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL="https://projectfifthyear.herokuapp.com/"

    val retrofitInstance: Api by lazy {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            /*          .client(okHttpClient) */
            .build()
        retrofit.create(Api::class.java)
    }

}