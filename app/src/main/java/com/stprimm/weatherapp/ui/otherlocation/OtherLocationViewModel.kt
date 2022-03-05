package com.stprimm.weatherapp.ui.otherlocation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stprimm.weatherapp.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OtherLocationViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
): ViewModel() {

    /*private val _text = MutableLiveData<String>().apply {
        value = "Toronto"
    }
    val text: LiveData<String> = _text*/
}