package com.example.swapitest.networking.repo.films

import com.example.kotlintesttmdb.network.ApiRequest
import com.example.kotlintesttmdb.network.ApiService
import com.example.swapitest.models.Film
import com.example.swapitest.networking.toDomain

class FilmRepoImpl constructor(private val apiService: ApiService) : FilmRepo, ApiRequest() {
    override suspend fun getFilm(film: String): Film {
        val res = apiRequest { apiService.getFilm(film) }
        return res.toDomain()
    }
}