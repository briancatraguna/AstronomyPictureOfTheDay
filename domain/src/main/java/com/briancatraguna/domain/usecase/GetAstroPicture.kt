package com.briancatraguna.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.briancatraguna.data.entities.AstroPictureResponse
import com.briancatraguna.data.repository.AstroPictureRepository
import com.briancatraguna.domain.model.AstroPicture
import javax.inject.Inject

class GetAstroPicture @Inject constructor(
    private val astroPictureRepository: AstroPictureRepository
): IGetAstroPicture {

    override suspend fun doWork(): LiveData<AstroPicture> {
        return Transformations.map(astroPictureRepository.astroPicture) {
            it.asDomainModel()
        }
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