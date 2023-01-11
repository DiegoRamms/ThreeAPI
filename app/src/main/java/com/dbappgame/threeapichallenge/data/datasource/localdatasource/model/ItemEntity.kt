package com.dbappgame.threeapichallenge.data.datasource.localdatasource.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")
data class ItemEntity(
    @ColumnInfo
    val title: String,
    @ColumnInfo
    val imageUrl: String,
    @ColumnInfo
    val type: String
){
    @PrimaryKey(autoGenerate = true)
    var itemId : Long = 0
}