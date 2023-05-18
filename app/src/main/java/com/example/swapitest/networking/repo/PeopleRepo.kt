package com.example.swapitest.networking.repo

import com.example.swapitest.models.People

interface PeopleRepo{
    suspend fun getPeople(page: Int): People
}