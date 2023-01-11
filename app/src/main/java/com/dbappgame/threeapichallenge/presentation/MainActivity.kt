package com.dbappgame.threeapichallenge.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.ui.theme.ThreeApiChallengeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.getData()
        setContent {

            ThreeApiChallengeTheme {
                // A surface container using the 'background' color from the theme
                var selectedItem by remember {
                    mutableStateOf(0)
                }
                Scaffold(

                    modifier = Modifier.fillMaxSize(),
                    topBar = {

                    },
                    bottomBar = {
                        BottomView(selectedItem = selectedItem) { dataType, position ->
                            viewModel.setDataParams(viewModel.dataParams.value.copy(textToSearch = ""))
                            selectedItem = position
                            viewModel.setDataParams(viewModel.dataParams.value.copy(needsUpdate = false, dataType = dataType))
                            viewModel.getData()
                        }
                    }) { paddingValues ->

                    EmptyView(viewModel.uiState.value.itemList.isEmpty())

                    Column(
                        modifier = Modifier.padding(bottom = paddingValues.calculateBottomPadding())
                    ) {


                        TopSearchBar(
                            textToSearch = viewModel.dataParams.value.textToSearch,
                            onTextChange = {viewModel.setDataParams(viewModel.dataParams.value.copy(textToSearch = it))},
                            onSearch = { viewModel.setDataParams(viewModel.dataParams.value.copy(needsUpdate = true));viewModel.getData()},
                            onCounterChange = {viewModel.setDataParams(viewModel.dataParams.value.copy(itemsNumber = it))},
                            showCounter = viewModel.typeView.value is DataType.Simpsons
                        )
                        LazyColumn() {
                            items(viewModel.uiState.value.itemList) { item ->
                                ItemView(item = item)
                            }
                        }
                    }


                }


            }


            LoadingView(isLoading = viewModel.uiState.value.isLoading)
        }
    }
}


