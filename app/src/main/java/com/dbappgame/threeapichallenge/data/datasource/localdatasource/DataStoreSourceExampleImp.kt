package com.dbappgame.threeapichallenge.data.datasource.localdatasource

import android.content.Context
import androidx.datastore.dataStore
import androidx.datastore.preferences.SharedPreferencesMigration
import androidx.datastore.preferences.preferencesDataStore
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.domain.datasource.LocalDataSource
import com.dbappgame.threeapichallenge.domain.model.Item
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
/*
class DataStoreSourceExampleImp @Inject constructor(@ApplicationContext context: Context): LocalDataSource {

    companion object{
        private const val USER_PREFERENCES_NAME = "user_preferences"
    }

     val Context.dataStores by preferencesDataStore(
        name = USER_PREFERENCES_NAME,
        produceMigrations = { context ->
            // Since we're migrating from SharedPreferences, add a migration based on the
            // SharedPreferences name
            listOf(SharedPreferencesMigration(context, USER_PREFERENCES_NAME))
        }
    )
    override suspend fun insert(dataType: DataType, itemList: List<Item>) {

    }

    override suspend fun deleteAll(dataType: DataType) {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(dataType: DataType): List<Item> {
        TODO("Not yet implemented")
    }

    override suspend fun getSize(dataType: DataType): Int {
        TODO("Not yet implemented")
    }
}*/