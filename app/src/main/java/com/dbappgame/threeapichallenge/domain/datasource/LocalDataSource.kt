package com.dbappgame.threeapichallenge.domain.datasource

import com.dbappgame.threeapichallenge.domain.model.Item

interface LocalDataSource {
    suspend fun insert(dataType: DataType, itemList: List<Item>)
    suspend fun deleteAll(dataType: DataType)
    suspend fun getAll(dataType: DataType): List<Item>
    suspend fun getSize(dataType: DataType): Int
}