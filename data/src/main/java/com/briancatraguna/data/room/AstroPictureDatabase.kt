package com.briancatraguna.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.briancatraguna.data.entities.AstroPictureResponse

@Database(
    entities = [
        AstroPictureResponse::class
    ], version = 1
)
abstract class AstroPictureDatabase: RoomDatabase() {

    abstract fun astroPictureDao(): AstroPictureDao
}