package com.briancatraguna.domain.usecase

import com.briancatraguna.data.repository.AstroPictureRepository
import javax.inject.Inject

class RefreshAstroPicture @Inject constructor(
    private val astroPictureRepository: AstroPictureRepository
): IRefreshAstroPicture {

    override suspend fun doWork() {
        astroPictureRepository.refreshAstroPicture()
    }

}