package com.eren.pokedex

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by erenalpaslan on 21.02.2021
 */
open class PokedexApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@PokedexApplication)
        }
    }
}