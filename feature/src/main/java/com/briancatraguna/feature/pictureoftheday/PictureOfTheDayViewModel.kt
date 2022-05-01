package com.briancatraguna.feature.pictureoftheday

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.hilt.AssistedViewModelFactory
import com.airbnb.mvrx.hilt.hiltMavericksViewModelFactory
import com.briancatraguna.domain.usecase.GetAstroPicture
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.launch

class PictureOfTheDayViewModel @AssistedInject constructor(
    @Assisted initialState: PictureOfTheDayViewState,
    private val getAstroPicture: GetAstroPicture
) : MavericksViewModel<PictureOfTheDayViewState>(initialState) {

    init {
        viewModelScope.launch {
            getAstroPicture().collect {
                setState {
                    copy(
                        astroPicture = it
                    )
                }
            }
        }
    }

    @AssistedFactory
    interface Factory : AssistedViewModelFactory<PictureOfTheDayViewModel, PictureOfTheDayViewState> {
        override fun create(state: PictureOfTheDayViewState): PictureOfTheDayViewModel
    }

    companion object : MavericksViewModelFactory<PictureOfTheDayViewModel, PictureOfTheDayViewState> by hiltMavericksViewModelFactory()

}