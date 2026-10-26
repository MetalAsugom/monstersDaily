package com.example.monsterdays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.monsterdays.R

data class Monster(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)

val monsters = listOf(
    Monster(imageResourceId = R.drawable.fatalis, R.string.fatalis, R.string.fatalisDescription)
)
