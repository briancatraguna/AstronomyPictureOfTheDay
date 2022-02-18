package com.briancatraguna.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.briancatraguna.data.entities.AstroPictureResponse
import io.reactivex.Observable

@Dao
interface AstroPictureDao {

    @Query("SELECT * FROM astro_pictures")
    fun getAllAstroPictures(): Observable<List<AstroPictureResponse>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAstroPicture(astroPictureResponse: AstroPictureResponse)

    @Query("DELETE FROM astro_pictures WHERE id = :id")
    fun deleteAstroPictureById(id: Int)
}