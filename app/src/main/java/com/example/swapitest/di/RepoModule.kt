package com.example.kotlintesttmdb.di

import com.example.swapitest.networking.repo.films.FilmRepo
import com.example.swapitest.networking.repo.films.FilmRepoImpl
import com.example.swapitest.networking.repo.films.FilmUseCase
import com.example.swapitest.networking.repo.people.PeopleRepo
import com.example.swapitest.networking.repo.people.PeopleRepoImpl
import com.example.swapitest.networking.repo.people.PeopleUseCase
import org.koin.dsl.module

val repoModule = module {
    single { PeopleUseCase(get()) }
    single<PeopleRepo> { PeopleRepoImpl(get()) }
    single { FilmUseCase(get()) }
    single<FilmRepo> { FilmRepoImpl(get()) }
}