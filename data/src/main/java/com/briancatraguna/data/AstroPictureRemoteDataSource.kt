package com.briancatraguna.data

import com.briancatraguna.data.retrofit.AstroPictureService
import javax.inject.Inject

class AstroPictureRemoteDataSource @Inject constructor(
    private val astroPictureService: AstroPictureService
) {

    fun getAstroPicture() = astroPictureService.getPictureOfTheDay()
}