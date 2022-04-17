package com.briancatraguna.feature

import androidx.lifecycle.*
import com.briancatraguna.domain.model.AstroPicture
import com.briancatraguna.domain.usecase.GetAstroPicture
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAstroPicture: GetAstroPicture
) : ViewModel() {

    private val _astroPicture: MutableLiveData<AstroPicture> = MutableLiveData()
    val astroPicture: LiveData<AstroPicture> get() = _astroPicture

    init {
        viewModelScope.launch {
            getAstroPicture.doWork().collect {
                _astroPicture.value = it
            }
        }
    }

}