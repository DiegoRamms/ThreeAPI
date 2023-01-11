package com.dbappgame.threeapichallenge.domain.datasource

import com.dbappgame.threeapichallenge.domain.model.Item

interface NetworkDataSource {
    suspend fun getResponse(networkType: DataType, textToSearch: String, itemsNumber: Int? = 0 ): List<Item>
}


sealed class DataType(val value: String) {
    data class News(val valueS: String = "N"): DataType(valueS)
    data class Simpsons(val valueS: String = "S"): DataType(valueS)
    data class Anime(val valueS: String = "A"): DataType(valueS)
}