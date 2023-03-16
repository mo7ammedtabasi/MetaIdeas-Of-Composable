package com.mo7ammedtabasi.c_testdeclarartivui.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class FirstViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow("")
    val state = _state.asStateFlow()


    fun onChangeId(newValue:String){
        _state.value = newValue
    }

    fun onChangeName(newValue:String){
        _state.value = newValue
    }
}