package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.PrimaryTextColor
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.Rubik
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.SecondaryTextColor

@Composable
fun Header(title: String, subTitle: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = subTitle,
            color = SecondaryTextColor,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}