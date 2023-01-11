package com.dbappgame.threeapichallenge.data.datasource.localdatasource.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.dbappgame.threeapichallenge.data.datasource.localdatasource.model.ItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDAO {

    @Insert
    fun insert(itemEntity: ItemEntity): Long

    @Insert
    fun insert(itemList: List<ItemEntity>)

    @Query("SELECT * FROM item where item.type = :type ")
    fun getAll(type: String): List<ItemEntity>

    @Query("SELECT count(*) FROM item where item.type = :type")
    fun getSize(type: String): Int

    @Query("DELETE FROM item where item.type = :type")
    fun delete(type: String)

}