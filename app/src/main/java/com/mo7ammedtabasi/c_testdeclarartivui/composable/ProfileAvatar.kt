package com.mo7ammedtabasi.c_testdeclarartivui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAvatar(painter:Painter,size:Int=128,modifier: Modifier = Modifier){

    Image(
        painter = painter,
        contentDescription = "Profile Picture",
        modifier =  modifier.clip(shape = RoundedCornerShape(16.dp)).size(size.dp)
    )
}