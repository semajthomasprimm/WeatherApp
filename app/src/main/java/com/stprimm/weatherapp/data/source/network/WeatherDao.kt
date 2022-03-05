package com.stprimm.weatherapp.data.source.network

import androidx.room.*
import com.stprimm.weatherapp.data.model.WeatherModel
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDao {

    @Query("SELECT * from weather")
    fun getAll(): Flow<List<WeatherEntity>>

    @Query("SELECT * from weather WHERE city_name = :city_name")
    fun get(city_name: String): Flow<WeatherEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(weather: List<WeatherEntity>)

    @Query("DELETE FROM weather")
    suspend fun deleteAll()

}