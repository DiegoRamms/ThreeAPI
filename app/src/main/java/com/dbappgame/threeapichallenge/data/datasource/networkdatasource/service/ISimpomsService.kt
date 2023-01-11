package com.dbappgame.threeapichallenge.data.datasource.networkdatasource.service

import com.dbappgame.threeapichallenge.data.datasource.networkdatasource.model.simpsons.SimpsonsDTO
import retrofit2.http.Query

/*
interface ISimponsService {

    suspend fun getResponse( count: Int): SimpsonsDTO


}


class SimpsonServiceImp(val service: SimpsonsService): ISimpomsService {
    override suspend fun getResponse(count: Int): SimpsonsDTO {
        return service.getResponse(count)
    }
}
/*
class SimpsonMockImp(val service: SimpsonsService): ISimpomsService {
    override suspend fun getResponse(count: Int): SimpsonsDTO {
        service.getResponse(count)
    }
}

class SimpsonFireBaseImp(val service: SimpsonsService): ISimpomsService {
    override suspend fun getResponse(count: Int): SimpsonsDTO {
        service.getResponse(count)
    }
}*/