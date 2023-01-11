package com.dbappgame.threeapichallenge.data.repository

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news.NewsDTO
import com.dbappgame.threeapichallenge.data.mapper.toDomain
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import com.dbappgame.threeapichallenge.domain.model.Item
import com.dbappgame.threeapichallenge.domain.repository.DataRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/*
class NewsRepositoryImp @Inject constructor(private val networkDataSource: NetworkDataSource<NewsDTO>) :
    DataRepository<List<Item>> {
    override suspend fun loadData(textToSearch: String, itemsNumber: Int?): BaseError? {
        try {
           networkDataSource.getResponse(textToSearch).toDomain()
        }catch (e: Exception){
           return BaseError.Error("Communicatin Error")
        }
        return null
    }

    override fun getData(): Flow<List<Item>> {
        TODO("Not yet implemented")
    }
}*/