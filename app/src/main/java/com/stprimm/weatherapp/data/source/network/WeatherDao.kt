package com.stprimm.weatherapp.data.source.network

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface WeatherDao {
    @Query("SELECT * from weather")
    fun getAll(): LiveData<List<WeatherEntity>>

    @Query("SELECT * from weather WHERE id = :id")
    suspend fun get(id: Long): WeatherEntity

    @Insert
    suspend fun insert(weather: WeatherEntity): Long

    @Delete
    suspend fun delete(weather: WeatherEntity)

    @Query("DELETE FROM weather WHERE id=:id")
    suspend fun delete(id: Long)

    @Query("DELETE FROM weather")
    suspend fun deleteAll()

    @Update
    suspend fun update(weather: WeatherEntity)
}