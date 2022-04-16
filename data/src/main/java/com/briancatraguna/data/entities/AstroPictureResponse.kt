package com.briancatraguna.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "astro_pictures")
data class AstroPictureResponse(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @SerializedName("copyright")
    @ColumnInfo(name = "copyright")
    val copyright: String? = null,

    @SerializedName("date")
    @ColumnInfo(name = "date")
    val date: String? = null,

    @SerializedName("explanation")
    @ColumnInfo(name = "explanation")
    val explanation: String? = null,

    @SerializedName("hdurl")
    @ColumnInfo(name = "hdurl")
    val hdUrl: String? = null,

    @SerializedName("media_type")
    @ColumnInfo(name = "media_type")
    val mediaType: String? = null,

    @SerializedName("title")
    @ColumnInfo(name = "title")
    val title: String? = null,

    @SerializedName("url")
    @ColumnInfo(name = "url")
    val url: String? = null
)
