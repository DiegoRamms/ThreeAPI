package com.dbappgame.threeapichallenge.domain.model

sealed interface BaseResult <T>{
    data class Success <T> (val data: T): BaseResult<T>
    data class Error <T>(val message: String): BaseResult<T>
}
