package com.briancatraguna.data.repository

import com.briancatraguna.data.entities.AstroPictureResponse
import kotlinx.coroutines.flow.Flow

interface IAstroPictureRepository {

    suspend fun getAstroPicture(): Flow<AstroPictureResponse?>

}