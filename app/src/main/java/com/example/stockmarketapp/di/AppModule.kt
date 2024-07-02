package com.example.stockmarketapp.di

import androidx.room.Room
import com.example.stockmarketapp.StockApplication
import com.example.stockmarketapp.data.local.StockDatabase
import com.example.stockmarketapp.data.remote.StockApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesRetrofit():StockApi{
        return Retrofit.Builder()
            .baseUrl(StockApi.BASE_URL).addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit):StockApi{
        return retrofit.create(StockApi::class.java)
    }
    @Provides
    @Singleton
    fun providesDatabase(app:StockApplication):StockDatabase{
        return Room.databaseBuilder(
            app,
            StockDatabase::class.java,
            "stock_db"
        ).build()
    }
}