package com.dbappgame.threeapichallenge.di

import com.dbappgame.threeapichallenge.data.repository.DataRepositoryImp
import com.dbappgame.threeapichallenge.domain.repository.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepositoryImp: DataRepositoryImp): DataRepository

}