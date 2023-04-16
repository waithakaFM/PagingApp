package com.example.pagingapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Correspond to the database model
 */
@Entity
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrewed: String,
    val imageUrl: String
)