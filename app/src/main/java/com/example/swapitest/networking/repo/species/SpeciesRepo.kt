package com.example.swapitest.networking.repo.species

import com.example.swapitest.models.Species

interface SpeciesRepo{
    suspend fun getData(name: String): Species
}