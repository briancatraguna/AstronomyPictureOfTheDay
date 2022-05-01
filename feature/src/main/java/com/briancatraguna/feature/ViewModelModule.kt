package com.briancatraguna.feature

import com.airbnb.mvrx.hilt.AssistedViewModelFactory
import com.airbnb.mvrx.hilt.MavericksViewModelComponent
import com.airbnb.mvrx.hilt.ViewModelKey
import com.briancatraguna.feature.pictureoftheday.PictureOfTheDayViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.multibindings.IntoMap

@Module
@InstallIn(MavericksViewModelComponent::class)
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PictureOfTheDayViewModel::class)
    fun pictureOfTheDayViewModelFactory(factory: PictureOfTheDayViewModel.Factory): AssistedViewModelFactory<*, *>
}