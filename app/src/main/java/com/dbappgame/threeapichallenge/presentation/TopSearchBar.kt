package com.dbappgame.threeapichallenge.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.dbappgame.threeapichallenge.ui.theme.Purple40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopSearchBar(
    textToSearch: String,
    showCounter: Boolean,
    onTextChange: (String) -> Unit,
    onSearch: () -> Unit,
    onCounterChange: (Int) -> Unit
) {

    var counter by remember {
        mutableStateOf(1)
    }
    Column(modifier = Modifier.padding(bottom = 10.dp, top = 4.dp, start = 4.dp, end = 4.dp)) {
        AnimatedVisibility(visible = showCounter) {
            Box(modifier = Modifier.padding(4.dp)) {

                Row(
                    modifier = Modifier
                        .height(40.dp)
                ) {
                    Button(onClick = {
                        if (counter >= 2) counter--
                        onCounterChange(counter)
                    }, modifier = Modifier.weight(3f)) {
                        Text(text = "-1")
                    }
                    Box(
                        modifier = Modifier
                            .weight(3f)
                            .width(20.dp)
                            .fillMaxHeight(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = counter.toString())
                    }
                    Button(onClick = {
                        counter++
                        onCounterChange(counter)
                    }, modifier = Modifier.weight(3f)) {
                        Text(text = "+1")
                    }
                }
            }
        }
        Row(
            modifier = Modifier

                .height(55.dp)
        ) {

            AnimatedVisibility(visible = showCounter.not()) {
                TextField(
                    value = textToSearch,
                    onValueChange = {
                        onTextChange(it)
                    },
                    modifier = Modifier.weight(8f),
                )
            }
            Box(
                modifier = Modifier
                    .weight(2f)
                    .padding(start = 4.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxSize()
                    .background(color = Purple40)
                    .clickable { onSearch.invoke() },
                contentAlignment = Alignment.Center
            ) {

                Image(
                    Icons.Filled.Search,
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(color = Color.White)
                )
            }

        }


    }

}