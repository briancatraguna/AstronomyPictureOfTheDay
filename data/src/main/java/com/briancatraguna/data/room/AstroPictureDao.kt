package com.briancatraguna.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.briancatraguna.data.entities.AstroPictureResponse

@Dao
interface AstroPictureDao {

    @Query("SELECT * FROM astro_pictures LIMIT 1")
    suspend fun getLastAstroPicture(): AstroPictureResponse

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAstroPicture(astroPictureResponse: AstroPictureResponse)

}