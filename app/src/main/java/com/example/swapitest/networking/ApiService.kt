package com.example.kotlintesttmdb.network

import com.example.swapitest.models.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("people")
    suspend fun getPeople(
        @Query("page") page: Int,
    ): Response<People>

    @GET("films/{film}")
    suspend fun getFilm(
        @Path("film") page: String,
    ): Response<Film>

    @GET("vehicles/{id}")
    suspend fun getVehicle(
        @Path("id") page: String,
    ): Response<Vehicle>

    @GET("starships/{id}")
    suspend fun getStarship(
        @Path("id") page: String,
    ): Response<Starship>

    @GET("species/{id}")
    suspend fun getSpecies(
        @Path("id") page: String,
    ): Response<Species>
}