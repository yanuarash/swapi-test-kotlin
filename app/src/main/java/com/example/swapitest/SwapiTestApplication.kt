package com.example.swapitest

import android.app.Application
import com.example.swapitest.di.networkModule
import com.example.swapitest.di.repoModule
import com.example.swapitest.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class SwapiTestApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val modules = listOf(networkModule, viewModelModule, repoModule)

        startKoin{
            androidLogger(level = Level.NONE)
            androidContext(this@SwapiTestApplication)
            modules(modules)
        }
    }
}