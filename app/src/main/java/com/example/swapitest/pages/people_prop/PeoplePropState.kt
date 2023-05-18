package com.example.swapitest.pages.people_prop

data class PeoplePropState(
    val isLoading: Boolean = false,
    val data: List<String>? = null,
    val error: String = ""
)