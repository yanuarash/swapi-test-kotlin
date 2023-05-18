package com.example.swapitest.networking.repo.films

import com.example.swapitest.getFilmUrl
import com.example.swapitest.networking.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class FilmUseCase constructor(private val filmRepo: FilmRepo) {
    operator fun invoke(films: List<String>): Flow<Resource<ArrayList<String>>> = flow {
        try {
            emit(Resource.Loading())
            val listFilms = getBulkFilm(films)
            emit(Resource.Success(listFilms))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.message.toString()))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }

    suspend fun getBulkFilm(films: List<String>): ArrayList<String> {
        val listFilms = arrayListOf<String>()

        if (films.size > 0) {
            for (value in films) {
                val res = filmRepo.getFilm(getFilmUrl(value))
                listFilms.add(res.title)
            }
        }

        return listFilms
    }
}