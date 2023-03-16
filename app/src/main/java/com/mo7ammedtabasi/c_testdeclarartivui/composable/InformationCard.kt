package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.CardBackgroundColor
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.PrimaryTextColor
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.Rubik
import com.mo7ammedtabasi.c_testdeclarartivui.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(title: String, information: String, onTextChange: (String) -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        backgroundColor = CardBackgroundColor,
        shape = RoundedCornerShape(16.dp),
        elevation = 0.dp
    ) {
        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            Text(
                text = title,
                fontWeight = FontWeight.Normal,
                fontSize = 9.sp,
                fontFamily = Rubik,
                color = SecondaryTextColor
            )

//            Text(
//                text = information,
//                fontWeight = FontWeight.Normal,
//                fontSize = 14.sp,
//                fontFamily = Rubik,
//                color = PrimaryTextColor
//            )

            BasicTextField(value = information, onValueChange = onTextChange)
        }
    }
}