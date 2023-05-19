package com.example.swapitest.networking

import com.example.swapitest.models.Film
import com.example.swapitest.models.People
import com.example.swapitest.models.Starship
import com.example.swapitest.models.Vehicle

internal fun People.toDomain(): People {
    return People(count, next, previous, results)
}

internal fun Film.toDomain(): Film {
    return Film(title)
}

internal fun Vehicle.toDomain(): Vehicle {
    return Vehicle(name)
}

internal fun Starship.toDomain(): Starship {
    return Starship(name)
}