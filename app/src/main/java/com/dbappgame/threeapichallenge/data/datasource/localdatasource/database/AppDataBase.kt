package com.dbappgame.threeapichallenge.data.datasource.localdatasource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dbappgame.threeapichallenge.data.datasource.localdatasource.model.ItemEntity

@Database(entities = [ItemEntity::class], version = 1)
abstract class AppDataBase: RoomDatabase() {

    abstract fun getItemDAO(): ItemDAO

}