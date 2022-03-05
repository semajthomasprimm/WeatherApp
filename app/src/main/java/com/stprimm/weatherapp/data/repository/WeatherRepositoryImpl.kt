package com.stprimm.weatherapp.data.repository

import com.stprimm.weatherapp.data.model.WeatherModel
import com.stprimm.weatherapp.data.source.network.WeatherDao
import com.stprimm.weatherapp.data.source.network.WeatherEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherDao: WeatherDao
): WeatherRepository{

    override fun getAll(): Flow<List<WeatherModel>> =
        weatherDao.getAll()
            .map{entityList ->
                entityList.map { entity ->
                    entity.asWeatherModel()
                }
            }.flowOn(Dispatchers.IO)

    override fun get(cityName: String): Flow<WeatherModel> =
        weatherDao.get(cityName)
            .map{entity -> entity.asWeatherModel()}
            .flowOn(Dispatchers.IO)

    override suspend fun refresh() {
        // impl WeatherDataApi
    }

    override suspend fun clear() {
        weatherDao.deleteAll()
    }
}

fun WeatherEntity.asWeatherModel() =
    WeatherModel(
        id = id,
        cityName = cityName,
        temp = temp,
        description = description,
        tempMax = tempMax,
        tempMin = tempMin
    )