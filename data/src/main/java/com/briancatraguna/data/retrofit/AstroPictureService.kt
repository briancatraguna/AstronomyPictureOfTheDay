package com.briancatraguna.data.retrofit

import com.briancatraguna.data.entities.AstroPictureResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface AstroPictureService {

    @GET("planetary/apod")
    fun getPictureOfTheDay(): Observable<AstroPictureResponse>
}