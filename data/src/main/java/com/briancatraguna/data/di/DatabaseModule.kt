package com.briancatraguna.data.di

import android.content.Context
import androidx.room.Room
import com.briancatraguna.data.room.AstroPictureDao
import com.briancatraguna.data.room.AstroPictureDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AstroPictureDatabase =
        Room.databaseBuilder(
            context,
            AstroPictureDatabase::class.java,
            "astro.db"
        ).build()

    @Provides
    fun provideAstroPictureDao(database: AstroPictureDatabase): AstroPictureDao =
        database.astroPictureDao()
}