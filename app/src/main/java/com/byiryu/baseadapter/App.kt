package com.byiryu.baseadapter

import android.app.Application
import com.byiryu.baseadapter.di.activityModule
import com.byiryu.baseadapter.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pyxis.uzuki.live.nyancat.NyanCatGlobal
import pyxis.uzuki.live.nyancat.config.LoggerConfig
import pyxis.uzuki.live.nyancat.config.TriggerTiming

class App : Application(){

    lateinit var loggerConfig: LoggerConfig

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    activityModule,
                    viewModelModule
                )
            )
        }

        loggerConfig = LoggerConfig(packageName, true, TriggerTiming.ALL)
        NyanCatGlobal.breed(loggerConfig)
    }
}