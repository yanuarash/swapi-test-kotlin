package com.example.kotlintesttmdb.di

import com.example.swapitest.networking.repo.PeopleRepo
import com.example.swapitest.networking.repo.PeopleRepoImpl
import com.example.swapitest.networking.repo.PeopleUseCase
import org.koin.dsl.module

val repoModule = module {
    single { PeopleUseCase(get()) }
    single<PeopleRepo> { PeopleRepoImpl(get()) }
}