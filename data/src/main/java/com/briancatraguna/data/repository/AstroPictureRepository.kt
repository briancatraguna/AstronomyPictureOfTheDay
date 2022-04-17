package com.briancatraguna.data.repository

import com.briancatraguna.data.datasources.AstroPictureLocalDataSource
import com.briancatraguna.data.datasources.AstroPictureRemoteDataSource
import com.briancatraguna.data.entities.AstroPictureResponse
import com.skydoves.sandwich.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AstroPictureRepository @Inject constructor(
    private val localDataSource: AstroPictureLocalDataSource,
    private val remoteDataSource: AstroPictureRemoteDataSource
) : IAstroPictureRepository {


    override suspend fun getAstroPicture(): Flow<AstroPictureResponse?> = flow {
        val localAstroPicture = localDataSource.getLastAstroPicture()
        emit(localAstroPicture)
        val response = remoteDataSource.fetchAstroPicture()
        response.suspendOnSuccess {
            localDataSource.insertAstroPicture(data)
            val updateLocalAstroPicture = localDataSource.getLastAstroPicture()
            emit(updateLocalAstroPicture)
        }.suspendOnError {
            emit(localAstroPicture)
        }
    }

}