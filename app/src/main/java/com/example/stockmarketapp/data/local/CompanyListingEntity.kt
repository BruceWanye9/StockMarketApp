package com.example.stockmarketapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.concurrent.Exchanger

@Entity // this is the entity class for the company listing
data class CompanyListingEntity(
    val name:String,
    val symbol:String,
    val exchanger: String,
    @PrimaryKey val id :Int?=null
 )
