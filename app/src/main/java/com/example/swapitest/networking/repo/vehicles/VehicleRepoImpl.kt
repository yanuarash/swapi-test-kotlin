package com.example.swapitest.networking.repo.vehicles

import com.example.kotlintesttmdb.network.ApiRequest
import com.example.kotlintesttmdb.network.ApiService
import com.example.swapitest.models.Vehicle
import com.example.swapitest.networking.toDomain

class VehicleRepoImpl constructor(private val apiService: ApiService) : VehicleRepo, ApiRequest() {
    override suspend fun getData(id: String): Vehicle {
        val res = apiRequest { apiService.getVehicle(id) }
        return res.toDomain()
    }
}