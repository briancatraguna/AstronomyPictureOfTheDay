package com.briancatraguna.domain.di

import com.briancatraguna.domain.usecase.GetAstroPicture
import com.briancatraguna.domain.usecase.IGetAstroPicture
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DomainModule {

    @Binds
    abstract fun provideGetAstroPicture(getAstroPicture: GetAstroPicture): IGetAstroPicture

}