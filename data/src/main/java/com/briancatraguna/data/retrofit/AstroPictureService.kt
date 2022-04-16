package com.briancatraguna.data.retrofit

import com.briancatraguna.data.BuildConfig
import com.briancatraguna.data.entities.AstroPictureResponse
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface AstroPictureService {

    @GET("planetary/apod")
    suspend fun fetchPictureOfTheDay(
        @Query("api_key") apiKey: String = BuildConfig.NASA_API_KEY
    ): ApiResponse<AstroPictureResponse>
}