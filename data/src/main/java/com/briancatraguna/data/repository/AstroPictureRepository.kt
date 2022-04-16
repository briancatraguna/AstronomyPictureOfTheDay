package com.briancatraguna.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.asLiveData
import com.briancatraguna.data.datasources.AstroPictureLocalDataSource
import com.briancatraguna.data.datasources.AstroPictureRemoteDataSource
import com.briancatraguna.data.entities.AstroPictureResponse
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.request
import com.skydoves.sandwich.suspendOnSuccess
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AstroPictureRepository @Inject constructor(
    private val localDataSource: AstroPictureLocalDataSource,
    private val remoteDataSource: AstroPictureRemoteDataSource
) : IAstroPictureRepository {

    val astroPicture: LiveData<AstroPictureResponse> =
        localDataSource.getLastAstroPicture().asLiveData()

    override suspend fun refreshAstroPicture() {
        withContext(Dispatchers.IO){
            val response = remoteDataSource.fetchAstroPicture()
            response.suspendOnSuccess {
                localDataSource.insertAstroPicture(data)
            }
        }
    }

}