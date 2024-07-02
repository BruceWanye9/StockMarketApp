package com.example.stockmarketapp.Domain.repository

import com.example.stockmarketapp.Domain.model.CompanyInfo
import com.example.stockmarketapp.Domain.model.CompanyListing
import com.example.stockmarketapp.Domain.model.IntradayInfo
import com.example.stockmarketapp.data.local.CompanyListingEntity
import com.example.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getcompanyListings(
     fetchFromRemote:Boolean,
     query:String
    ): Flow<Resource<List<CompanyListing>>>

suspend fun getIntradayInfo(
    symbol:String
): Resource<List<IntradayInfo>>

suspend fun getCompanyInfo(
    symbol:String
): Resource<CompanyInfo>
}