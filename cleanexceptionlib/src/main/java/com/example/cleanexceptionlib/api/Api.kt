package com.example.cleanexceptionlib.api

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("Errors")
    fun Errors(
        @Field("ApiKey") ApiKey:String,
        @Field("ApiSecret") ApiSecret:String,
        @Field("projectKey") projectKey:String,
        @Field("Column") Column:Int,
        @Field("Row") Row:Int,
        @Field("FileName") FileName:String,
        @Field("Path") Path:String,
        @Field("Description") Description:String,
        @Field("Title") Title:String
    ): Call<Void>
}