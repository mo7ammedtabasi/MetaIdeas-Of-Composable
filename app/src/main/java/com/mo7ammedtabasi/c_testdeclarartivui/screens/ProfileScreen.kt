package com.mo7ammedtabasi.c_testdeclarartivui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.mo7ammedtabasi.c_testdeclarartivui.R
import com.mo7ammedtabasi.c_testdeclarartivui.composable.ButtonSave
import com.mo7ammedtabasi.c_testdeclarartivui.composable.Header
import com.mo7ammedtabasi.c_testdeclarartivui.composable.InformationCard
import com.mo7ammedtabasi.c_testdeclarartivui.composable.ProfileAvatar
import com.mo7ammedtabasi.c_testdeclarartivui.composable.SpacerHorizontal16
import com.mo7ammedtabasi.c_testdeclarartivui.composable.SpacerVertical24
import com.mo7ammedtabasi.c_testdeclarartivui.composable.SpacerVertical32
import com.mo7ammedtabasi.c_testdeclarartivui.composable.TextButton
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.ProfileViewModel
import com.mo7ammedtabasi.c_testdeclarartivui.viewModel.state.ProfileUiState

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    ProfileContent(
        state = state,
        onChangeFirstName = viewModel::onChangeFiresName,
        onChangeLastName = viewModel::onChangeLastName,
        onChangeLocation = viewModel::onChangeLocation,
        onChangeEmail = viewModel::onChangeEmail,
        onChangePhone = viewModel::onChangePhone,
        onSaveUserInfo = viewModel::saveUserInformation
    )
}

@Composable
fun ProfileContent(
    state: ProfileUiState,
    onChangeFirstName: (String) -> Unit,
    onChangeLastName: (String) -> Unit,
    onChangeLocation: (String) -> Unit,
    onChangeEmail: (String) -> Unit,
    onChangePhone: (String) -> Unit,
    onSaveUserInfo: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(
            title = stringResource(R.string.account),
            subTitle = stringResource(R.string.account_subtitle)
        )
        SpacerVertical32()
//        ProfileAvatar(painter = painterResource(id = R.drawable.me))
        ProfileAvatar(painter = rememberAsyncImagePainter(model = state.profilePictureLink))
        SpacerVertical24()
        TextButton(text = stringResource(R.string.change_profile_picture)) {
        }
        SpacerVertical32()
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(
                    title = stringResource(R.string.first_name),
                    information = state.firesName,
                    onTextChange = onChangeFirstName
                )
            }
            SpacerHorizontal16()
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(
                    title = stringResource(R.string.last_name),
                    information = state.lastName,
                    onTextChange = onChangeLastName
                )
            }
        }
        InformationCard(
            title = stringResource(R.string.location),
            information = state.location,
            onTextChange = onChangeLocation
        )
        InformationCard(
            title = stringResource(R.string.email),
            information = state.email,
            onTextChange = onChangeEmail
        )
        InformationCard(
            title = stringResource(R.string.phone),
            information = state.phone,
            onTextChange = onChangePhone
        )
        Spacer(modifier = Modifier.weight(1f))
        ButtonSave(text = stringResource(R.string.save), onClick = onSaveUserInfo)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}