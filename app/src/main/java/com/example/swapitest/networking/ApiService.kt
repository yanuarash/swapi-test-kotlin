package com.example.kotlintesttmdb.network

import com.example.swapitest.models.People
import com.example.swapitest.networking.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("people/?page={page}")
    suspend fun getPeople(
        @Path("page") page: Int,
    ): Response<People>

}