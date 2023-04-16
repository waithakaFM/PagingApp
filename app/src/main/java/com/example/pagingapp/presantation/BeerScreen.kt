package com.example.pagingapp.presantation

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.example.pagingapp.domain.Beer

@Composable
fun BeerScreen(
    beers: LazyPagingItems<Beer>
){
    val context = LocalContext.current
    LaunchedEffect(key1 = beers.loadState){
        if (beers.loadState.refresh is LoadState.Error){
            Toast.makeText(
                context,
                "Error: " + (beers.loadState.refresh as LoadState.Error).error.message,
                Toast.LENGTH_SHORT
            ).show()
        }
    }


}