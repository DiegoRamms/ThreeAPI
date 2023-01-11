package com.dbappgame.threeapichallenge.di

import com.dbappgame.threeapichallenge.data.datasource.localdatasource.ItemLocalDataSourceImp
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.NetworkDataSourceImp
import com.dbappgame.threeapichallenge.domain.datasource.LocalDataSource
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {


    @Binds
    @Singleton
    abstract fun bindNewsNetDataSource(networkDataSourceImp: NetworkDataSourceImp): NetworkDataSource

    @Binds
    @Singleton
    abstract fun bindLocalDataSource(localDataSource: ItemLocalDataSourceImp): LocalDataSource



}