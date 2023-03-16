package com.mo7ammedtabasi.c_testdeclarartivui.viewModel

import androidx.lifecycle.ViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.ProfileUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(): ViewModel() {

    private val _state = MutableStateFlow(ProfileUiState())
    val state = _state.asStateFlow()

    init {
        getUserInfo()
    }
    private fun getUserInfo(){
        // Call GetUserInfoUseCase
        _state.update { it.copy(profilePictureLink = "https://www.shutterstock.com/image-photo/young-handsome-man-beard-wearing-260nw-1768126784.jpg") }
    }
    fun onChangeFiresName(newValue:String){
        _state.update { it.copy(firesName = newValue) }
    }

    fun onChangeLastName(newValue:String){
        _state.update { it.copy(lastName = newValue) }
    }

    fun onChangeLocation(newValue:String){
        _state.update { it.copy(location = newValue) }
    }

    fun onChangeEmail(newValue:String){
        _state.update { it.copy(email = newValue) }
    }

    fun onChangePhone(newValue:String){
        _state.update { it.copy(phone = newValue) }
    }

    fun saveUserInformation(){
        // SaveUserInfoUseCase
    }
}