package com.dbappgame.threeapichallenge.data.datasource.networkdatasource

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons.SimpsonsDTO
import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service.SimpsonsService
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import javax.inject.Inject

/*
class SimpsonsNetDataSourceImp @Inject constructor(
    private val service: SimpsonsService
): NetworkDataSource<SimpsonsDTO> {
    override suspend fun getResponse(textToSearch: String, itemsNumber: Int?): SimpsonsDTO {
        return service.getResponse(itemsNumber ?: 0)
    }
}*/