package com.stprimm.weatherapp.data.source.network

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather")
data class WeatherEntity(

    @PrimaryKey val id: String,
    @ColumnInfo(name = "city_name") val cityName: String,
    @ColumnInfo(name = "temp") val temp: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "temp_max") val tempMax: String,
    @ColumnInfo(name = "temp_min") val tempMin: String,
)
