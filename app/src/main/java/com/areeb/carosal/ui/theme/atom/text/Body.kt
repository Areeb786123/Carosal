package com.areeb.carosal.ui.theme.atom.text

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.areeb.carosal.ui.utils.TypoGraphy.LocalTypography

object Body {
    @Composable
    fun Medium(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier.fillMaxWidth(),
            text = text,
            style = LocalTypography.current.title.medium,
            color = Color.Black,
            textAlign = textAlign
        )
    }

    @Composable
    fun Large(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Text(
            modifier = modifier.fillMaxWidth(),
            text = text,
            style = LocalTypography.current.title.large,
            color = Color.Black,
            textAlign = textAlign
        )
    }
}