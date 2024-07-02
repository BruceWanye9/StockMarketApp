package com.example.stockmarketapp.Presentation.company_info

import com.example.stockmarketapp.Domain.model.CompanyInfo
import com.example.stockmarketapp.Domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
