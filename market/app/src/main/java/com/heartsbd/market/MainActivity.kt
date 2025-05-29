package com.heartsbd.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.heartsbd.market.ui.theme.HappyBirthDayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthDayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        name = "James",
                        from = "Emma",
                        modifier = Modifier.padding(8.dp),
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = "Happy Birthday, $name!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            modifier = modifier,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "From, $from!",
            fontSize = 36.sp,
            lineHeight = 40.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthDayTheme {
        GreetingText(name = "James", from = "Emma")
    }
}