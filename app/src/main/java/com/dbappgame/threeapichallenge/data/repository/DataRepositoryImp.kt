package com.dbappgame.threeapichallenge.data.repository

import com.dbappgame.threeapichallenge.domain.datasource.LocalDataSource
import com.dbappgame.threeapichallenge.domain.datasource.NetworkDataSource
import com.dbappgame.threeapichallenge.domain.model.BaseResult
import com.dbappgame.threeapichallenge.domain.model.DataParams
import com.dbappgame.threeapichallenge.domain.model.Item
import com.dbappgame.threeapichallenge.domain.repository.DataRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class DataRepositoryImp @Inject constructor(val networkDataSource: NetworkDataSource, private val localDataSource: LocalDataSource): DataRepository {
    override suspend fun getData(dataParams: DataParams): BaseResult<List<Item>> {
        return try {
            with(dataParams){
                if (needsUpdate){

                    val itemList = networkDataSource.getResponse(dataType,textToSearch, itemsNumber)
                    localDataSource.deleteAll(dataType)
                    localDataSource.insert(dataType,itemList)
                }
            }
            BaseResult.Success(localDataSource.getAll(dataParams.dataType))
        }catch (e: Exception){
             BaseResult.Error("Error : $e")
        }
    }
}