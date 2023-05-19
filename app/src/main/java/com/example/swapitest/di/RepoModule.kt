package com.example.swapitest.di

import com.example.swapitest.networking.repo.films.FilmRepo
import com.example.swapitest.networking.repo.films.FilmRepoImpl
import com.example.swapitest.networking.repo.films.FilmUseCase
import com.example.swapitest.networking.repo.people.PeopleRepo
import com.example.swapitest.networking.repo.people.PeopleRepoImpl
import com.example.swapitest.networking.repo.people.PeopleUseCase
import com.example.swapitest.networking.repo.species.SpeciesRepo
import com.example.swapitest.networking.repo.species.SpeciesRepoImpl
import com.example.swapitest.networking.repo.species.SpeciesUseCase
import com.example.swapitest.networking.repo.starships.StarshipRepo
import com.example.swapitest.networking.repo.starships.StarshipRepoImpl
import com.example.swapitest.networking.repo.starships.StarshipUseCase
import com.example.swapitest.networking.repo.vehicles.VehicleRepo
import com.example.swapitest.networking.repo.vehicles.VehicleRepoImpl
import com.example.swapitest.networking.repo.vehicles.VehicleUseCase
import org.koin.dsl.module

val repoModule = module {
    single { PeopleUseCase(get()) }
    single<PeopleRepo> { PeopleRepoImpl(get()) }
    single { FilmUseCase(get()) }
    single<FilmRepo> { FilmRepoImpl(get()) }
    single { VehicleUseCase(get()) }
    single<VehicleRepo> { VehicleRepoImpl(get()) }
    single { StarshipUseCase(get()) }
    single<StarshipRepo> { StarshipRepoImpl(get()) }
    single { SpeciesUseCase(get()) }
    single<SpeciesRepo> { SpeciesRepoImpl(get()) }
}