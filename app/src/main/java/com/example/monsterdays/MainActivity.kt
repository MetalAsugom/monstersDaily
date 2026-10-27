package com.example.monsterdays

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun MonsterApp(){
Scaffold { it ->
    LazyColumn(contentPadding = it) {
        items(monsters) {
            MonsterItem(
                monster = it,
            )
            }
        }
    }
}

@Composable
fun MonsterItem(
    monster: Monster,
    modifier : Modifier = Modifier,
) {
    Card(modifier = modifier) {
        Row(
            modifier = modifier
                        .fillMaxWidth()
                        .padding()
        ) {
            MonsterImage(monster.imageResourceId)
        }
    }
}

@Composable
fun MonsterImage(
    @DrawableRes monsterImage: Int,
    modifier: Modifier = Modifier
)
    {
    Image(
        modifier = modifier,
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,
        painter = painterResource(monsterImage),
        contentDescription = null,
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MonsterDaysTheme {
        MonsterApp()
    }
}