package com.mo7ammedtabasi.c_testdeclarartivui.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(): ViewModel(){
    private val _state = MutableStateFlow(0)
    val state = _state.asStateFlow()

    fun onIncreaseCounter(){
        _state.update { it + 1 }
    }

    fun onDecreaseCounter(){
        _state.update { it - 1 }
    }
}