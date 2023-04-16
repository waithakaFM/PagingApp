package com.example.pagingapp.data.mapper

import com.example.pagingapp.data.local.BeerEntity
import com.example.pagingapp.data.remote.BeerDto
import com.example.pagingapp.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity{
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

/**
 * Local cache is the SST
 */
fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}