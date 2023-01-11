package com.dbappgame.threeapichallenge.domain.model

import com.dbappgame.threeapichallenge.domain.datasource.DataType

data class DataParams(
    var needsUpdate: Boolean = false,
    var dataType: DataType,
    var textToSearch: String = "",
    var itemsNumber: Int? = 0
)
