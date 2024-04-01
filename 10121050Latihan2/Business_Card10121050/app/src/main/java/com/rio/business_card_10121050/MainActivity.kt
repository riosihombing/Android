package com.rio.business_card_10121050

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rio.business_card_10121050.ui.theme.Business_Card10121050Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_Card10121050Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    // section for profile info
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFCEF9DC)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(width = 100.dp, height = 100.dp)
                .background(Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.Name_text),
            fontSize = 40.sp
        )
        Text(
            text = stringResource(R.string.title_text),
            color = Color(0xFF006600),
            fontWeight = FontWeight.Bold
        )
    }
    // section for contact info
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp, bottom = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        ContactInfo(
            info = stringResource(id = R.string.phone_text),
            icon = Icons.Filled.Phone
        )
        ContactInfo(
            info = stringResource(R.string.share_text),
            icon = Icons.Filled.Share
        )
        ContactInfo(
            info = stringResource(id = R.string.email_text),
            icon = Icons.Filled.Email
        )
    }
}

@Composable
private fun ContactInfo(
    info: String,
    icon: ImageVector
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 100.dp, 8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 16.dp)
                .size(16.dp),
            tint = Color(0xFF006600)
        )
        Text(
            text = info,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    Business_Card10121050Theme {
        BusinessCardApp()
    }
}
