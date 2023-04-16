package com.example.pagingapp.presantation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.pagingapp.data.local.BeerEntity
import com.example.pagingapp.data.mapper.toBeer
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class BeerViewModel @Inject constructor(
   pager: Pager<Int, BeerEntity>
): ViewModel() {

    val beerPagingFlow = pager
        .flow
        .map { pagingData ->
            pagingData.map { it.toBeer() }
        }
        .cachedIn(viewModelScope)
}