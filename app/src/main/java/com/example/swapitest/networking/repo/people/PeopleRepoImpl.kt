package com.example.swapitest.networking.repo.people

import com.example.kotlintesttmdb.network.ApiRequest
import com.example.kotlintesttmdb.network.ApiService
import com.example.swapitest.models.People
import com.example.swapitest.networking.toDomain

class PeopleRepoImpl constructor(private val apiService: ApiService) : PeopleRepo, ApiRequest() {
    override suspend fun getPeople(page: Int): People {
        val res = apiRequest { apiService.getPeople(page) }
        return res.toDomain()
    }
}