package com.stprimm.weatherapp.ui.currentlocation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stprimm.weatherapp.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrentLocationViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
): ViewModel() {

    /*private val _text = MutableLiveData<String>().apply {
        value = "Please enable location services"
    }
    val text: LiveData<String> = _text*/
}