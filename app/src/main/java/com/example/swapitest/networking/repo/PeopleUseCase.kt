package com.example.swapitest.networking.repo

import com.example.swapitest.models.People
import com.example.swapitest.networking.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class PeopleUseCase constructor(private val peopleRepo: PeopleRepo) {
    operator fun invoke(page: Int): Flow<Resource<People>> = flow{
        try {
            emit(Resource.Loading())
            val res = peopleRepo.getPeople(page)
            emit(Resource.Success(res))
        }
        catch (e: HttpException){
            emit(Resource.Error(message = e.message.toString()))
        }
        catch (e: IOException){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}