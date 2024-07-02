package com.example.stockmarketapp.Presentation.company_Listing

import com.example.stockmarketapp.Domain.model.CompanyListing

data class CompanyListingsState(
val companies:List<CompanyListing> = emptyList(),
    val isLoading:Boolean = false,
    val isRefreshing:Boolean = false,
    val searchquery:String = ""
)
