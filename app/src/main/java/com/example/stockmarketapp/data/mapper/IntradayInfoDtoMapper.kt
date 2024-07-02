package com.example.stockmarketapp.data.mapper

import com.example.stockmarketapp.Domain.model.IntradayInfo
import com.example.stockmarketapp.data.remote.dto.IntradayInfoDto
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestrap.toString(),formatter)
    return IntradayInfo(
        date = localDateTime,
        close = close
    )
}
