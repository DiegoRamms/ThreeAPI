package com.dbappgame.threeapichallenge.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.dbappgame.threeapichallenge.R
import com.dbappgame.threeapichallenge.domain.datasource.DataType

@Composable
fun BottomView(selectedItem: Int, onSelectOption: (DataType, Int) -> Unit) {
    NavigationBar {
        BottomItems.items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    onSelectOption(
                        when (index) {
                            0 -> DataType.News()
                            1 -> DataType.Simpsons()
                            2 -> DataType.Anime()
                            else -> throw Exception()
                        }, index
                    )
                },
                label = { Text(text = item) },
                icon = {
                    Icon(
                        painterResource(id = BottomItems.icons[index]),
                        contentDescription = item
                    )
                })
        }
    }
}


object BottomItems {
    val items = arrayListOf("News", "Simpsons", "Anime")
    val icons = listOf(R.drawable.ic_sheet, R.drawable.ic_homer_simpson, R.drawable.ic_naruto)
}