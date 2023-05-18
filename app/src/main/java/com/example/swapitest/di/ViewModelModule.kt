package com.example.swapitest.di

import com.example.swapitest.models.People
import com.example.swapitest.pages.people.PeopleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel{PeopleViewModel(get())}
}