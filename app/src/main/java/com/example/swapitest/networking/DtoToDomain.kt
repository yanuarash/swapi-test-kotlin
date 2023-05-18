package com.example.swapitest.networking

import com.example.swapitest.models.People

internal fun People.toDomain(): People {
    return People(count, next, previous, results)
}