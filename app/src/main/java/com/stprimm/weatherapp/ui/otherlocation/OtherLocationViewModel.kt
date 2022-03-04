package com.stprimm.weatherapp.ui.otherlocation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OtherLocationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Toronto"
    }
    val text: LiveData<String> = _text
}