package com.briancatraguna.data.entities

import com.google.gson.annotations.SerializedName

data class AstroPictureResponse(
    @SerializedName("copyright")
    val copyright: String? = null,

    @SerializedName("date")
    val date: String? = null,

    @SerializedName("explanation")
    val explanation: String? = null,

    @SerializedName("hdurl")
    val hdUrl: String? = null,

    @SerializedName("media_type")
    val mediaType: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("url")
    val url: String? = null
)
