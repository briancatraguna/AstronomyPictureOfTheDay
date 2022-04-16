package com.briancatraguna.data.di

import com.briancatraguna.data.repository.AstroPictureRepository
import com.briancatraguna.data.repository.IAstroPictureRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(includes = [NetworkModule::class, DatabaseModule::class, RestClient::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(repository: AstroPictureRepository): IAstroPictureRepository

}