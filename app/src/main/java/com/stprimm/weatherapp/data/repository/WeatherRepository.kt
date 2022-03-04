package com.stprimm.weatherapp.data.model.repository

import com.stprimm.weatherapp.data.model.WeatherModel
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    fun getAll(): Flow<List<WeatherModel>>
    fun get(cityName: String): Flow<WeatherModel>
    suspend fun refresh()
    suspend fun clear()
}