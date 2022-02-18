package com.briancatraguna.data.di

import com.briancatraguna.data.retrofit.AstroPictureService
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun providesApodService(): AstroPictureService {
        val baseUrl = ""
    }

}