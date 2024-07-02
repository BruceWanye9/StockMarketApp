package com.example.stockmarketapp.data.mapper

import com.example.stockmarketapp.Domain.model.CompanyInfo
import com.example.stockmarketapp.Domain.model.CompanyListing
import com.example.stockmarketapp.data.local.CompanyListingEntity
import com.example.stockmarketapp.data.remote.dto.CompanyInfoDto


fun CompanyListingEntity.toCompanyListing():CompanyListing {
    return CompanyListing(
        name= name,
        symbol = symbol,
        exchanger=exchanger
    )
}
fun CompanyListing.toCompanyListingEntity():CompanyListingEntity {
    return CompanyListingEntity(
        name= name,
        symbol = symbol,
        exchanger=exchanger
    )
}
fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol?:"",
        name = name?:"",
        discription = discription?:"",
        country = country?:"",
        industry = industry?:""
    )
}