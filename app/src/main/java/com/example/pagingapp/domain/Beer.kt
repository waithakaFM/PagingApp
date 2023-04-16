package com.example.pagingapp.domain

/**
 * Common class for our whole project
 */
data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val firstBrewed: String,
    val description: String,
    val imageUrl: String?
)
