package com.example.stockmarketapp.data.csv

import com.example.stockmarketapp.Domain.model.CompanyListing
import com.opencsv.CSVReader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.InputStream
import java.io.InputStreamReader
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CompanyListingParser @Inject constructor():CsvParser<CompanyListing>
{
    override suspend fun parseCsv(stream: InputStream): List<CompanyListing> {
        val csvreader=CSVReader(InputStreamReader(stream))
        return withContext(Dispatchers.IO){
            csvreader.readAll().drop(1).mapNotNull {line->
                val symbol =line.getOrNull(0)
                val name =line.getOrNull(1)
                val exchanger =line.getOrNull(2)
                CompanyListing(
                    name = name?: return@mapNotNull null,
                    symbol = symbol?:return@mapNotNull null,
                    exchanger = exchanger?: return@mapNotNull null
                )
            }
                .also {
                    csvreader.close()
                }
        }
    }
}