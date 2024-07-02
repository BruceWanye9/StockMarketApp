package com.example.stockmarketapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import org.apache.commons.logging.Log

@HiltAndroidApp
class StockApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        android.util.Log.d(TAG,"Inside Application class")
    }
    companion object{
        const val TAG = "StockApplication"
    }
}