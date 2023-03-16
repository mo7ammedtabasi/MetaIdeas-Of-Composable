package com.mo7ammedtabasi.c_testdeclarartivui.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.screens.second.SecondArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class SecondViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow("")
    val state = _state.asStateFlow()

    private val args : SecondArgs = SecondArgs(savedStateHandle)

    init {
        sayHello()
    }

    private fun sayHello() {
        _state.update { "Hello ${args.name}" }
    }
}