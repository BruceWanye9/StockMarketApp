package com.example.stockmarketapp.Domain.model

import com.squareup.moshi.Json

data class CompanyInfo(
     val symbol:String,
     val name:String,
    val discription:String,
    val country:String,
    val industry:String
)
