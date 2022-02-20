package com.briancatraguna.data.di

import com.briancatraguna.data.AstroPictureRemoteDataSource
import com.briancatraguna.data.retrofit.AstroPictureService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    fun providesAstroPictureService(
        @RestClient retrofit: Retrofit
    ): AstroPictureService {
        return retrofit.create(AstroPictureService::class.java)
    }

    @Provides
    fun providesAstroPictureRemoteDataSource(astroPictureService: AstroPictureService): AstroPictureRemoteDataSource {
        return AstroPictureRemoteDataSource(astroPictureService)
    }
}