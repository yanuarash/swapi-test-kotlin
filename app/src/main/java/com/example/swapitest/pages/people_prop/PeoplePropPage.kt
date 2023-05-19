package com.example.swapitest.pages.people_prop

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.swapitest.pages.people.PeopleViewModel
import com.example.swapitest.pages.people_prop.viewmodel.FilmViewModel
import com.example.swapitest.pages.people_prop.viewmodel.SpeciesViewModel
import com.example.swapitest.pages.people_prop.viewmodel.StarshipViewModel
import com.example.swapitest.pages.people_prop.viewmodel.VehicleViewModel
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun PeoplePropPage(
    viewModel: FilmViewModel = getViewModel(), peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.films) {
        viewModel.getFilm(peopleViewModel.peopleDetail.films)
    }

    PeoplePropContent(
        title = "Film", list = list, isLoading = currentState.isLoading, error = currentState.error
    ) {
        viewModel.getFilm(peopleViewModel.peopleDetail.films)
    }
}

@ExperimentalMaterialApi
@Composable
fun VehiclePropPage(
    viewModel: VehicleViewModel = getViewModel(), peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.vehicles) {
        viewModel.getData(peopleViewModel.peopleDetail.vehicles)
    }

    PeoplePropContent(
        title = "Vehicle",
        list = list,
        isLoading = currentState.isLoading,
        error = currentState.error
    ) {
        viewModel.getData(peopleViewModel.peopleDetail.vehicles)
    }
}

@ExperimentalMaterialApi
@Composable
fun StarshipPropPage(
    viewModel: StarshipViewModel = getViewModel(), peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.starships) {
        viewModel.getData(peopleViewModel.peopleDetail.starships)
    }

    PeoplePropContent(
        title = "Starship",
        list = list,
        isLoading = currentState.isLoading,
        error = currentState.error
    ) {
        viewModel.getData(peopleViewModel.peopleDetail.starships)
    }
}

@ExperimentalMaterialApi
@Composable
fun SpeciesPropPage(
    viewModel: SpeciesViewModel = getViewModel(), peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.species) {
        viewModel.getData(peopleViewModel.peopleDetail.species)
    }

    PeoplePropContent(
        title = "Species",
        list = list,
        isLoading = currentState.isLoading,
        error = currentState.error
    ) {
        viewModel.getData(peopleViewModel.peopleDetail.species)
    }
}