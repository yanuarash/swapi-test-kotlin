package com.example.swapitest.networking.repo.species

import com.example.kotlintesttmdb.network.ApiRequest
import com.example.kotlintesttmdb.network.ApiService
import com.example.swapitest.models.Species
import com.example.swapitest.models.Starship
import com.example.swapitest.networking.repo.starships.StarshipRepo
import com.example.swapitest.networking.toDomain

class SpeciesRepoImpl constructor(private val apiService: ApiService) : SpeciesRepo, ApiRequest() {
    override suspend fun getData(id: String): Species {
        val res = apiRequest { apiService.getSpecies(id) }
        return res.toDomain()
    }
}