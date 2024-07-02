package com.example.stockmarketapp.Domain.model

import java.time.LocalDateTime

data class IntradayInfo(
    val date:LocalDateTime,
    val close:Double
)
