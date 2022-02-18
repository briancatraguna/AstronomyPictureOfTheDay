package com.briancatraguna.data.di

import android.content.Context
import androidx.room.Room
import com.briancatraguna.data.room.AstroPictureDao
import com.briancatraguna.data.room.AstroPictureDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideDatabase(context: Context): AstroPictureDatabase =
        Room.databaseBuilder(
            context,
            AstroPictureDatabase::class.java,
            "astro.db"
        ).build()

    @Provides
    fun provideAstroPictureDao(database: AstroPictureDatabase): AstroPictureDao =
        database.astroPictureDao()
}