package com.plcoding.stockmarketapp.di

import com.example.stockmarketapp.Domain.model.CompanyListing
import com.example.stockmarketapp.Domain.model.IntradayInfo
import com.example.stockmarketapp.Domain.repository.StockRepository
import com.example.stockmarketapp.data.csv.CompanyListingParser
import com.example.stockmarketapp.data.csv.IntradayInfoParser
import com.example.stockmarketapp.data.repository.StockRepositoryImpl
import com.opencsv.CSVParser



import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingParser
    ): CSVParser

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}