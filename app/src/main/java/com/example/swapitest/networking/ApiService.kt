package com.example.kotlintesttmdb.network

import com.example.swapitest.models.Film
import com.example.swapitest.models.People
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
}