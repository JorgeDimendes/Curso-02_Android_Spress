package com.jordev.fitnesstracker

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class MainItem(
    val id: Int,
    @DrawableRes val drawable: Int,
    @StringRes val textStringId: Int,
    val color: Int
)
