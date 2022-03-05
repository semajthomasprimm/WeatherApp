package com.stprimm.weatherapp.data.workmanager;

import com.stprimm.weatherapp.data.repository.WeatherRepository
import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import retrofit2.HttpException

@HiltWorker
class RefreshWorker @AssistedInject constructor(
        @Assisted appContext: Context,
        @Assisted params: WorkerParameters,
        private val repository: WeatherRepository
) : CoroutineWorker(appContext, params){

        companion object{
            const val WORK_NAME = "com.stprimm.weatherapp.workmanager.RefreshWorker"
            const val MAX_ATTEMPT_COUNT = 3
        }

        override suspend fun doWork(): Result {
            try {
                repository.refresh()
            } catch (e: HttpException) {
                return if(runAttemptCount < MAX_ATTEMPT_COUNT){
                Result.retry()
                }else{
                    Result.failure()
                }
            }

        return Result.success()
        }
}
