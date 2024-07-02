package com.example.stockmarketapp.Presentation.company_Listing

 sealed class CompanyListingsEvent {
        object Refesh:CompanyListingsEvent()
     data class onsearchQuerychange(val query:String):CompanyListingsEvent()
}