package com.example.monsterdays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.MonsterDaysTheme
import com.example.monsterdays.data.Monster
import com.example.monsterdays.data.monsters

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonsterDaysTheme {
            }
        }
    }
}



@Composable
fun MonsterItem(
    @DrawableRes monster: Int
) {
    Card() {


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MonsterDaysTheme {
    }
}