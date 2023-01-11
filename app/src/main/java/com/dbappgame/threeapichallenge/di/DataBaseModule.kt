package com.dbappgame.threeapichallenge.di

import android.content.Context
import androidx.room.Room
import com.dbappgame.threeapichallenge.data.datasource.localdatasource.database.AppDataBase
import com.dbappgame.threeapichallenge.data.datasource.localdatasource.database.ItemDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext applicationContext: Context): AppDataBase =
        Room.databaseBuilder(applicationContext,AppDataBase::class.java,"DataBase").build()

    @Provides
    @Singleton
    fun provideItemDAO(appDataBase: AppDataBase): ItemDAO =
        appDataBase.getItemDAO()

}