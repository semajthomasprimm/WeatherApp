package com.stprimm.weatherapp.data.source.network

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideWeatherDao(database: WeatherDatabase): WeatherDao{
        return database.weatherDao()
    }

    @Singleton
    @Provides
    fun provideWeatherDatabase(@ApplicationContext context: Context): WeatherDatabase{
        return Room.databaseBuilder(context, WeatherDatabase::class.java, "weather_database").build()
    }
}