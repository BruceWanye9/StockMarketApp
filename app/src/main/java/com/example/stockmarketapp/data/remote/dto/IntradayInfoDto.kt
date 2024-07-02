package com.example.stockmarketapp.data.remote.dto

import java.time.LocalDateTime

data class IntradayInfoDto (
    val timestrap:LocalDateTime,
    val close:Double
)