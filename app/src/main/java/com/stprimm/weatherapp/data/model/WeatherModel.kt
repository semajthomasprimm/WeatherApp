package com.stprimm.weatherapp.data.model

data class WeatherModel(
    val id: String,
    val cityName: String,
    val temp: String,
    val description: String,
    val tempMax: String,
    val tempMin: String
)
