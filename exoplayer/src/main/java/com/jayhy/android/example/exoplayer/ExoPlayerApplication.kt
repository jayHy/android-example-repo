package com.jayhy.android.example.exoplayer

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ExoPlayerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}