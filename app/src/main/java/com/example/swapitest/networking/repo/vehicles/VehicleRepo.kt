package com.example.swapitest.networking.repo.vehicles

import com.example.swapitest.models.Film
import com.example.swapitest.models.Vehicle

interface VehicleRepo{
    suspend fun getData(film: String): Vehicle
}