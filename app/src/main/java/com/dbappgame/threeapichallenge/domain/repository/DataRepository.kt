package com.dbappgame.threeapichallenge.domain.repository

import com.dbappgame.threeapichallenge.domain.model.BaseResult
import com.dbappgame.threeapichallenge.domain.model.DataParams
import com.dbappgame.threeapichallenge.domain.model.Item
import kotlinx.coroutines.flow.Flow

interface DataRepository {
    suspend fun getData(dataParams: DataParams): BaseResult<List<Item>>
}