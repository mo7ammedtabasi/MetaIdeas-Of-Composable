package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.Orange
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.Rubik

@Composable
fun TextButton(
    text:String,
    onClick: ()->Unit,
){

    Text(
        text = text,
        color = Orange,
        fontWeight = FontWeight.Medium,
        fontFamily = Rubik,
        fontSize = 14.sp,
        modifier = Modifier.clickable { onClick }
    )
}