package com.stprimm.weatherapp

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import dagger.hilt.android.HiltAndroidApp
import androidx.work.*;
import com.stprimm.weatherapp.data.workmanager.setupRefreshWork
import javax.inject.Inject

@HiltAndroidApp
class WeatherApplication: Application() {

    /*@Inject
    lateinit var workerFactory: HiltWorkerFactory

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder().setWorkerFactory(workerFactory).build()
    }

    override fun onCreate() {
        super.onCreate()
        setupRefreshWork(this)
    }*/
}