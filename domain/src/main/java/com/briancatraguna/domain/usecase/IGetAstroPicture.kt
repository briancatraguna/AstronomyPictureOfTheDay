package com.briancatraguna.domain.usecase

import com.briancatraguna.domain.model.AstroPicture
import kotlinx.coroutines.flow.Flow

interface IGetAstroPicture {

    suspend fun doWork(): Flow<AstroPicture?>

}