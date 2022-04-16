package com.briancatraguna.data.datasources

import com.briancatraguna.data.entities.AstroPictureResponse
import com.briancatraguna.data.retrofit.AstroPictureService
import com.skydoves.sandwich.ApiResponse
import retrofit2.Call
import javax.inject.Inject

class AstroPictureRemoteDataSource @Inject constructor(
    private val astroPictureService: AstroPictureService
) {

    suspend fun fetchAstroPicture(): ApiResponse<AstroPictureResponse> {
        return astroPictureService.fetchPictureOfTheDay()
    }

}