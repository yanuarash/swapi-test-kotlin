package com.example.swapitest.models

import kotlinx.serialization.Serializable

@Serializable
data class Film (
    val title: String,
)

@Serializable
data class Species (
    val name: String,
)

@Serializable
data class Starship (
    val name: String,
)

@Serializable
data class Vehicle (
    val name: String,
)