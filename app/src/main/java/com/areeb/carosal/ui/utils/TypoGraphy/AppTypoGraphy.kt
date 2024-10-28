package com.areeb.carosal.ui.utils.TypoGraphy

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf

data class AppTypoGraphy(
    @Stable
    val title: TitleTypo = TitleTypo()
)

@Stable
val LocalTypography = staticCompositionLocalOf { AppTypoGraphy() }