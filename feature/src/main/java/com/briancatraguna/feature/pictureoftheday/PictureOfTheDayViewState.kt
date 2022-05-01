package com.briancatraguna.feature.pictureoftheday

import com.airbnb.mvrx.MavericksState
import com.briancatraguna.domain.model.AstroPicture

data class PictureOfTheDayViewState(
    val astroPicture: AstroPicture? = null
) : MavericksState
