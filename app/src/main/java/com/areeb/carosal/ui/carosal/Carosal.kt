package com.areeb.carosal.ui.carosal

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.areeb.carosal.data.entity.BasicDto


@Composable
fun Carosale(
    modifier: Modifier = Modifier,
    list: List<BasicDto>
) {
    val state = rememberPagerState(initialPage = 0, pageCount = { list.size })
    HorizontalPager(
        modifier = Modifier.fillMaxWidth(),
        state = state,
    ) { page ->

        val currentItem = list[page % list.size]
        CarosalTemplate(basicDto = currentItem)

    }
}


@Preview
@Composable
private fun PreviewCarosal() {
    val list = listOf(
        BasicDto(
            name = "Pikachu",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://imaginaire.com/en/images/POKEMON-PIKACHU-BURST-POSTER-22-X-34__5028486420261.JPG",
            backgroundImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiPJaRP-xuV0b1QA4vjwaSnmuWDbgKq07FYg&s"

        ),
        BasicDto(
            name = "charlizard",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://i.pinimg.com/736x/bd/e1/54/bde154723b4d09a6eab43748f1c12ac5.jpg",
            backgroundImage =
            "https://images6.alphacoders.com/135/1351898.png"

        ),
        BasicDto(
            name = "bulbasoure",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdBsSMkY707O-PHjwQTc5O7NH69ngBtBHsRw&s",
            backgroundImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5XQNfd2hFN7x3c_yhtpNnRx___oTVJlelZg&s"

        ),
        BasicDto(
            name = "mew",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://i.pinimg.com/736x/63/15/df/6315df9ea4fbd1d9b1b806dd8b72948b.jpg",
            backgroundImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR77_Ec3_bJuJhQ6j0cjHSFX6UacYGfmKddVQ&s"

        ),
        BasicDto(
            name = "darkrai",
            description = "Electric type",
            level = 32,
            thumblinkUrl =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmtWbqG-MW3qpselZGTqFVGT2NCletj8l8rw&s",
            backgroundImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRC14fXLSsOe9q7fCNB_DEqN7T343yFy8jxbQ&s"

        )
    )
    Carosale(list = list)

}

inline val Int.percent: Float get() = this / 100f