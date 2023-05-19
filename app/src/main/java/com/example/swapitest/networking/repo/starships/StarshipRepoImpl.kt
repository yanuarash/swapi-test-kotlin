package com.example.swapitest.networking.repo.starships

import com.example.kotlintesttmdb.network.ApiRequest
import com.example.kotlintesttmdb.network.ApiService
import com.example.swapitest.models.Starship
import com.example.swapitest.models.Vehicle
import com.example.swapitest.networking.repo.vehicles.VehicleRepo
import com.example.swapitest.networking.toDomain

class StarshipRepoImpl constructor(private val apiService: ApiService) : StarshipRepo, ApiRequest() {
    override suspend fun getData(id: String): Starship {
        val res = apiRequest { apiService.getStarship(id) }
        return res.toDomain()
    }
}