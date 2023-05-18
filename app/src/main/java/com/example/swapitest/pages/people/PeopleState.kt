package com.example.swapitest.pages.people

import com.example.swapitest.models.People

data class PeopleState(
    val isLoading: Boolean = false,
    val data: People? = null,
    val error: String =""
)