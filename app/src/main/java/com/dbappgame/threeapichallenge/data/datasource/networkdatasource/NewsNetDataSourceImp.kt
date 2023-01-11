package com.dbappgame.threeapichallenge.data.datasource.networkdatasource

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.news.NewsDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.NewsService
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import javax.inject.Inject

/*
class NewsNetDataSourceImp @Inject constructor(
    private val service: NewsService
) : NetworkDataSource<> {
    override suspend fun getResponse(textToSearch: String, itemsNumber: Int?): NewsDTO {
        return service.getResponse(textToSearch)
    }
}*/