package com.example.stockmarketapp.data.csv

import com.example.stockmarketapp.Domain.model.CompanyListing
import java.io.InputStream

interface CsvParser<T> {
    suspend fun parseCsv(stream:InputStream): List<T>
}