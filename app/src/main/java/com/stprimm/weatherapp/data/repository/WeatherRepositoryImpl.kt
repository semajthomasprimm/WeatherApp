package com.stprimm.weatherapp.data.repository

import com.stprimm.weatherapp.data.model.WeatherModel
import com.stprimm.weatherapp.data.model.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow

class WeatherRepositoryImpl constructor(): WeatherRepository{
    override fun getAll(): Flow<List<WeatherModel>> {
        TODO("Not yet implemented")
    }

    override fun get(cityName: String): Flow<WeatherModel> {
        TODO("Not yet implemented")
    }

    override suspend fun refresh() {
        TODO("Not yet implemented")
    }

    override suspend fun clear() {
        TODO("Not yet implemented")
    }
}