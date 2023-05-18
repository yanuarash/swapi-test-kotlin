package com.example.swapitest.models

import com.fasterxml.jackson.annotation.JsonProperty

data class People (
    val count: Int,
    val next: String,
    val previous: String?,
    val results: List<PeopleResult>
)

data class PeopleResult(
    val name: String,
    val height: String,
    val mass: String,
    @JsonProperty("hair_color")
    val hairColor: String,
    @JsonProperty("skin_color")
    val skinColor: String,
    @JsonProperty("eye_color")
    val eyeColor: String,
    @JsonProperty("birth_year")
    val birthYear: String,
    val gender: String,
    val homeworld: String,
    val films: List<String>,
    val species: List<String>,
    val vehicles: List<String>,
    val starships: List<String>,
    val created: String,
    val edited: String,
    val url: String,
)
