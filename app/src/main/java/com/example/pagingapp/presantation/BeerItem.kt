package com.example.pagingapp.presantation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pagingapp.domain.Beer
import com.example.pagingapp.ui.theme.PagingAppTheme

class BeerItem(
    beer: Beer,
    modifier: Modifier = Modifier
) {
}

@Preview
@Composable
fun BeerItemPreview(){
    PagingAppTheme {
        BeerItem(
            beer = Beer(
                id = 1,
                name = "Beer",
                tagline = "This is a cool bear",
                firstBrewed = "12/22/2020",
                description = "This is a description for beer. \n Next Line \n Final!!",
                imageUrl = null
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}