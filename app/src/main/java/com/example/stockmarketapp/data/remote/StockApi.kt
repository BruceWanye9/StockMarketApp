package com.example.stockmarketapp.data.remote
import com.example.stockmarketapp.Domain.model.CompanyInfo
import com.example.stockmarketapp.data.remote.dto.CompanyInfoDto
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface StockApi {
    @GET("query?function=LISTING_STATUS")// we define the end point url here
    suspend fun  getListings(
        @Query("apikey") apikey:String= API_KEY
    ) : ResponseBody
    @GET("query?function=TIME_SERIES_INTRADAY&interval=60min&datatype=csv")
    suspend fun getIntradayInfo(
        @Query("symbol") symbol:String,
        @Query("apikey") apikey:String=API_KEY
    ): ResponseBody
    @GET("query?function=OVERVIEW")
    suspend fun getCompanyInfo(
        @Query("symbol") symbol:String,
        @Query("apikey") apikey:String=API_KEY
    ): CompanyInfoDto
    companion object {
        const val API_KEY="QASPBOLCI9WAIMO8"
        const val BASE_URL="https://alphavantange.co"
    }
}

