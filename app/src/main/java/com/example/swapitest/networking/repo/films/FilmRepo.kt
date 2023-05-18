package com.example.swapitest.networking.repo.films

import com.example.swapitest.models.Film

interface FilmRepo{
    suspend fun getFilm(film: String): Film
}