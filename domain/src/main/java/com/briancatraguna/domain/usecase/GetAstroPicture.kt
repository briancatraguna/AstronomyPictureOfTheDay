package com.briancatraguna.domain.usecase

import com.briancatraguna.data.entities.AstroPictureResponse
import com.briancatraguna.data.repository.AstroPictureRepository
import com.briancatraguna.domain.model.AstroPicture
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetAstroPicture @Inject constructor(
    private val astroPictureRepository: AstroPictureRepository
): IGetAstroPicture {

    override suspend fun doWork(): Flow<AstroPicture?> {
        return astroPictureRepository.getAstroPicture().map { it?.asDomainModel() }
    }

}

fun AstroPictureResponse.asDomainModel(): AstroPicture {
    return AstroPicture(
        this.copyright,
        this.date,
        this.explanation,
        this.hdUrl,
        this.mediaType,
        this.title,
        this.url
    )
}