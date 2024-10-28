package com.areeb.carosal.ui.carosal

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import com.areeb.carosal.data.entity.BasicDto
import com.areeb.carosal.ui.theme.atom.text.Body

@Composable
fun CarosalTemplate(
    modifier: Modifier = Modifier,
    basicDto: BasicDto
) {
    Box(
        modifier = modifier
            .padding(10.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        AsyncImage(
            modifier = modifier
                .fillMaxSize()
                .blur(5.dp),
            model = basicDto.backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        AsyncImage(
            modifier = modifier
                .width(70.dp)
                .height(70.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 10.dp)
                .clip(RoundedCornerShape(20.dp)),
            model = basicDto.thumblinkUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )

        Column(modifier.fillMaxWidth()) {
            Spacer(modifier = modifier.height(10.dp))
            Body.Large(
                text = basicDto.name.toString(),
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = modifier.height(20.dp))
            Body.Medium(
                text = basicDto.description.toString(),
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }

    }
}

@Preview
@Composable
private fun PreivewCarosalTemplate() {
    CarosalTemplate(
        basicDto = BasicDto(
            name = "Pikachu",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://imaginaire.com/en/images/POKEMON-PIKACHU-BURST-POSTER-22-X-34__5028486420261.JPG",
            backgroundImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiPJaRP-xuV0b1QA4vjwaSnmuWDbgKq07FYg&s"

        )
    )
}