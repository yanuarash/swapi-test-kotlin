package com.example.swapitest.networking.repo.starships

import com.example.swapitest.models.Starship

interface StarshipRepo{
    suspend fun getData(name: String): Starship
}