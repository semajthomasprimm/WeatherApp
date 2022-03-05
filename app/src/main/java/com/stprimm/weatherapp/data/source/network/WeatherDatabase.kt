package com.stprimm.weatherapp.data.source.network

//import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [WeatherEntity::class], version = 1, exportSchema = false)
//@TypeConverters(Converters::class)
abstract class WeatherDatabase: RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}