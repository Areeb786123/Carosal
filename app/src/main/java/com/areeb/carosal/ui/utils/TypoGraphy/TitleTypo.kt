package com.areeb.carosal.ui.utils.TypoGraphy

import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class TitleTypo(
    val large: TextStyle =
        TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        ),

    val medium: TextStyle =
        TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        )

)