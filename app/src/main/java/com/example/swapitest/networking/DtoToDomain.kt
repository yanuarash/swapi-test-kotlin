package com.example.swapitest.networking

import com.example.swapitest.models.*

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

internal fun Species.toDomain(): Species {
    return Species(name)
}