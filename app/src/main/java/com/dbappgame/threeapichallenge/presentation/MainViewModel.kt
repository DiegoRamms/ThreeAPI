package com.dbappgame.threeapichallenge.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dbappgame.threeapichallenge.domain.datasource.DataType
import com.dbappgame.threeapichallenge.domain.model.BaseResult
import com.dbappgame.threeapichallenge.domain.model.DataParams
import com.dbappgame.threeapichallenge.domain.model.Item
import com.dbappgame.threeapichallenge.domain.repository.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {

    private val _uiState  = mutableStateOf(UIState())
    val uiState : State<UIState> get() = _uiState

    private val _dataParams: MutableState<DataParams> = mutableStateOf(DataParams(true,DataType.News()))
    val dataParams : State<DataParams> get() = _dataParams

    private val _typeView = mutableStateOf<DataType>(DataType.News())
    val typeView: State<DataType> get() = _typeView



    init {
       _dataParams.value = DataParams(false, dataType = DataType.News(), "")
    }


    fun setDataParams(dataParams: DataParams){
        _dataParams.value = dataParams
        _typeView.value = dataParams.dataType
    }


    fun getData(){
        _dataParams.value = _dataParams.value.copy()
        _uiState.value = _uiState.value.copy(isLoading = true)
        viewModelScope.launch(Dispatchers.IO) {
            val result =  repository.getData(_dataParams.value)
            withContext(Dispatchers.Main){
                _uiState.value = when(result){
                    is BaseResult.Success -> _uiState.value.copy(itemList = result.data, error = null)
                    is BaseResult.Error -> _uiState.value.copy(error = result.message)
                }
                _uiState.value = _uiState.value.copy(isLoading = false)
            }
        }
    }
}


data class UIState(
    val isLoading: Boolean = false,
    val itemList: List<Item> = emptyList(),
    val error: String? = null
)