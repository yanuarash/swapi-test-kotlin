package com.example.swapitest.networking.repo.species

import com.example.swapitest.getUrl
import com.example.swapitest.networking.Resource
import com.example.swapitest.networking.repo.starships.StarshipRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class SpeciesUseCase constructor(private val speciesRepo: SpeciesRepo) {
    operator fun invoke(list: List<String>): Flow<Resource<ArrayList<String>>> = flow {
        try {
            emit(Resource.Loading())
            val listData = getBulk(list)
            emit(Resource.Success(listData))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.message.toString()))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }

    suspend fun getBulk(list: List<String>): ArrayList<String> {
        val listData = arrayListOf<String>()

        if (list.size > 0) {
            for (value in list) {
                val res = speciesRepo.getData(getUrl(url = value, startIndex = 30))
                listData.add(res.name)
            }
        }

        return listData
    }
}