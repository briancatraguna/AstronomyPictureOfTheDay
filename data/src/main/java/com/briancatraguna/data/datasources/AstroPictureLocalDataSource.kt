package com.briancatraguna.data.datasources

import com.briancatraguna.data.entities.AstroPictureResponse
import com.briancatraguna.data.room.AstroPictureDao
import javax.inject.Inject

class AstroPictureLocalDataSource @Inject constructor(
    private val astroPictureDao: AstroPictureDao
) {

    fun getLastAstroPicture() = astroPictureDao.getLastAstroPicture()

    suspend fun insertAstroPicture(
        astroPicture: AstroPictureResponse
    ) = astroPictureDao.insertAstroPicture(astroPicture)

}