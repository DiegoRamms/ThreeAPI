package com.dbappgame.threeapichallenge.data.datasource.localdatasource

import com.dbappgame.threeapichallenge.data.datasource.localdatasource.database.ItemDAO
import com.dbappgame.threeapichallenge.data.mapper.toDomain
import com.dbappgame.threeapichallenge.data.mapper.toEntity
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.domain.datasource.LocalDataSource
import com.dbappgame.threeapichallenge.domain.model.Item
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ItemLocalDataSourceImp @Inject constructor(
    private val itemDAO: ItemDAO
): LocalDataSource {

    override suspend fun insert(dataType: DataType, itemList: List<Item>) {
        itemDAO.insert(itemList.map { it.toEntity(dataType) })
    }

    override suspend fun deleteAll(dataType: DataType) {
        itemDAO.delete(dataType.value)
    }

    override suspend fun getAll(dataType: DataType): List<Item> {
        val type = dataType.value
        return itemDAO.getAll(type).map { it.toDomain() }
    }

    override suspend fun getSize(dataType: DataType): Int {
        return itemDAO.getSize(dataType.value)
    }
}
