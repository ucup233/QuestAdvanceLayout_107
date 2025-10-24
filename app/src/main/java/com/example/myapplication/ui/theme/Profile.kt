package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun HomePage(modifier: Modifier){
    Column(modifier = Modifier
        .padding(top = 70.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Logo Instagram",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.tiktok),
                contentDescription = "Logo TikTok",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.gmail),
                contentDescription = "Logo Gmail",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = "Logo LinkedIn",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = stringResource(id= R.string.namaku),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = stringResource(id = R.string.username),
            fontSize = 18.sp
        )
        Text(
            text = stringResource(id = R.string.description),
            fontSize = 19.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically)
            {
                Image(
                    painter = painterResource(id = R.drawable.tiktok),
                    contentDescription = null,

                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(
                    modifier = Modifier.width(width = 20.dp)
                )
                Text(
                    text = stringResource(R.string.username),
                    fontSize = 23.sp,
                    color = White
                    )
                Spacer(
                    modifier = Modifier.width(width = 50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.go),
                    contentDescription = null,

                    modifier = Modifier
                        .size(size = 25.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically)
            {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,

                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(
                    modifier = Modifier.width(width = 20.dp)
                )
                Text(
                    text = stringResource(R.string.username),
                    fontSize = 23.sp,
                    color = White
                )
                Spacer(
                    modifier = Modifier.width(width = 50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.go),
                    contentDescription = null,

                    modifier = Modifier
                        .size(size = 25.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

            }
        }
    }
}