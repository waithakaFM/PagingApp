package com.example.pagingapp.data.remote

/**
 * Respond to the network model
 */
data class BeerDto(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val first_brewed: String,
    val image_url: String
)