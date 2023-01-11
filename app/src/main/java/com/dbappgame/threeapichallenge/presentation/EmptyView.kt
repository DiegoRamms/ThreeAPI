package com.dbappgame.threeapichallenge.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.airbnb.lottie.compose.*
import com.dbappgame.threeapichallenge.R

@Composable
fun EmptyView(isEmpty: Boolean) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.empty_view))
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )
    AnimatedVisibility(isEmpty, enter = fadeIn(), exit = fadeOut()) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                LottieAnimation(composition = composition, progress = { progress }, modifier = Modifier.height(200.dp).width(200.dp))
                Text(text = "No Items", fontSize = 25.sp)
            }

        }
    }
}