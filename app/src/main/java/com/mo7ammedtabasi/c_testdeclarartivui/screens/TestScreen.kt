package com.mo7ammedtabasi.c_testdeclarartivui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun TestScreen() {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (button, fab, textHello) = createRefs()
        val guideLine = createGuidelineFromTop(1 / 3f)
        val verticalGuideLine = createGuidelineFromEnd(32.dp)
        val (textFirst, textSecond, textThird) = createRefs()
        val chain = createHorizontalChain(
            textFirst,textSecond,textThird,
        chainStyle = ChainStyle.SpreadInside)
        Button(onClick = { },
            modifier = Modifier.constrainAs(button) {
//                top.linkTo(parent.top)
//                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(guideLine)
            }
        ) {
            Text(text = "Click My Please :(")
        }

        FloatingActionButton(onClick = {}, modifier = Modifier.constrainAs(fab) {
            bottom.linkTo(parent.bottom, 32.dp)
            end.linkTo(verticalGuideLine)
        }) {

        }

        Text(text = "Hello Constraint Layout", fontSize = 24.sp, modifier = Modifier
            .constrainAs(textHello) {
                top.linkTo(button.bottom, 16.dp)
                start.linkTo(button.start)
                end.linkTo(button.end)
            })


        Text(
            text = "First",
            fontSize = 24.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(16.dp)
                .constrainAs(textFirst){

                }
        )

        Text(
            text = "Second",
            fontSize = 24.sp,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
                .constrainAs(textSecond){

                }
        )

        Text(
            text = "Third",
            fontSize = 24.sp,
            modifier = Modifier
                .background(Color.Green)
                .padding(16.dp)
                .constrainAs(textThird){

                }
        )
    }
}