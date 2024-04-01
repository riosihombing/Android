package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceImage()
                }
            }
            }
        }
    }

@Composable
fun ArtSpaceImage ( modifier : Modifier = Modifier  )
{
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = Color(0xffEDDBC0)) , horizontalAlignment = Alignment.CenterHorizontally) {
        var num by remember { mutableStateOf(1) }
        var imageResource = R.drawable.girl_with_a_pearl_earring
        var imageName = R.string.girl_pearl_text
        var imageArtist = R.string.girl_pearl_artist
        if ( num == 2 ) {
            imageResource = R.drawable.las_meninas
            imageName = R.string.las_men_text
            imageArtist = R.string.las_men_artist
        }
        else if ( num == 3 ){
            imageResource = R.drawable.the_astronomer
            imageName = R.string.astro_text
            imageArtist = R.string.astro_artist
        }
        else if ( num == 4 ) {
            imageResource = R.drawable.the_kiss
            imageName = R.string.kiss_text
            imageArtist = R.string.kiss_artist
        }
        else if ( num == 5 || num == 0) {
            imageResource = R.drawable.wanderer_above_the_sea_of_fog
            imageName = R.string.wanderer_text
            imageArtist = R.string.wanderer_artist
            num = 5
        }
        else if ( num == 6 ) {
            imageResource = R.drawable.girl_with_a_pearl_earring
            imageName = R.string.girl_pearl_text
            imageArtist = R.string.girl_pearl_artist
            num = 1
        }
        Column(modifier = Modifier.padding(top = 40.dp)) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = num.toString(),modifier = Modifier
                    .border(BorderStroke(10.dp, Color.White))
                    .shadow(elevation = 14.dp)

            )
        }

        Column(modifier = Modifier.padding(top = 50.dp) .background(color = Color.White) .border(
            BorderStroke(5.dp,Color(0xff9E7676))
        ) ) {

            Column() {
                Text(text = stringResource(id = imageName), fontFamily = FontFamily.Serif, fontSize = 25.sp, modifier = Modifier.padding(start = 8.dp,
                    top = 8.dp,
                end = 8.dp,
                bottom = 2.dp)
                    )
            }
            Column() {
                Text(text = stringResource(id = imageArtist),fontFamily = FontFamily.Serif,fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp,
                    top = 1.dp,
                    end = 8.dp,
                    bottom = 8.dp))
            }

        }

        Column(modifier = Modifier.padding(top = 30.dp)) {

            Row() {
                Button(onClick = { num-- }) {
                    Text(stringResource(R.string.previous))
                }
                Row (modifier = Modifier.padding(all = 50.dp)) {

                }
                Row() {
                    Button(onClick = { num++ }) {
                        Text(text = stringResource(R.string.next))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceDisplay( )
{
    ArtSpaceImage()
}