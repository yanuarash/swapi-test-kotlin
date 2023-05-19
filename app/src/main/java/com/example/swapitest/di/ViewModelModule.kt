package com.example.swapitest.di

import com.example.swapitest.pages.people.PeopleViewModel
import com.example.swapitest.pages.people_prop.viewmodel.FilmViewModel
import com.example.swapitest.pages.people_prop.viewmodel.SpeciesViewModel
import com.example.swapitest.pages.people_prop.viewmodel.StarshipViewModel
import com.example.swapitest.pages.people_prop.viewmodel.VehicleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { PeopleViewModel(get()) }
    viewModel { FilmViewModel(get()) }
    viewModel { VehicleViewModel(get()) }
    viewModel { StarshipViewModel(get()) }
    viewModel { SpeciesViewModel(get()) }
}