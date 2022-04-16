package com.briancatraguna.domain.usecase

import androidx.lifecycle.LiveData
import com.briancatraguna.domain.model.AstroPicture

interface IGetAstroPicture {

    suspend fun doWork(): LiveData<AstroPicture>

}