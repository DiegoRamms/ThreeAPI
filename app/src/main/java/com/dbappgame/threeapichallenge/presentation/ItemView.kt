package com.dbappgame.threeapichallenge.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.dbappgame.threeapichallenge.R
import com.dbappgame.threeapichallenge.domain.model.Item
import com.dbappgame.threeapichallenge.ui.theme.GreyTransparent
import com.dbappgame.threeapichallenge.ui.theme.Purple80
import com.dbappgame.threeapichallenge.ui.theme.Shapes

@OptIn(ExperimentalGlideComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ItemView(item: Item) {
    var showImage by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier.padding(4.dp)) {


        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp))
                .background(GreyTransparent)
        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {


                AnimatedVisibility(visible = showImage) {
                    AsyncImage(
                        model = item.imageUrl, contentDescription = "", modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        error = painterResource(id = R.drawable.no_image)
                    )
                }

                Card(modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(), onClick = { showImage = !showImage }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp), contentAlignment = Alignment.Center
                    ) {
                        Text(text = item.title, modifier = Modifier.padding(4.dp))
                    }

                }

            }
        }
    }
}