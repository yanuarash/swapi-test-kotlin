package com.example.swapitest.pages.people_prop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.example.swapitest.pages.LoadingProgress
import com.example.swapitest.pages.NoDataMsg
import com.example.swapitest.pages.RetryMsg
import com.example.swapitest.pages.people.PeopleViewModel
import com.example.swapitest.pages.people_prop.viewmodel.FilmViewModel
import com.example.swapitest.pages.people_prop.viewmodel.SpeciesViewModel
import com.example.swapitest.pages.people_prop.viewmodel.StarshipViewModel
import com.example.swapitest.pages.people_prop.viewmodel.VehicleViewModel
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun FilmPropPage(
    viewModel: FilmViewModel = getViewModel(), peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.films) {
        viewModel.getFilm(peopleViewModel.peopleDetail.films)
    }

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Film") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (currentState.isLoading) {
                LoadingProgress()
            } else if (list != null) {
                ListData(list = list)
            } else if (!currentState.error.isEmpty()) {
                RetryMsg(msg = currentState.error) {
                    viewModel.getFilm(peopleViewModel.peopleDetail.films)
                }
            } else {
                NoDataMsg(msg = "No Data")
            }
        }
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

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Vehicles") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (currentState.isLoading) {
                LoadingProgress()
            } else if (list != null) {
                ListData(list = list)
            } else if (!currentState.error.isEmpty()) {
                RetryMsg(msg = currentState.error) {
                    viewModel.getData(peopleViewModel.peopleDetail.vehicles)
                }
            } else {
                NoDataMsg(msg = "No Data")
            }
        }
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

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Starships") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (currentState.isLoading) {
                LoadingProgress()
            } else if (list != null) {
                ListData(list = list)
            } else if (!currentState.error.isEmpty()) {
                RetryMsg(msg = currentState.error) {
                    viewModel.getData(peopleViewModel.peopleDetail.starships)
                }
            } else {
                NoDataMsg(msg = "No Data")
            }
        }
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

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Species") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (currentState.isLoading) {
                LoadingProgress()
            } else if (list != null) {
                ListData(list = list)
            } else if (!currentState.error.isEmpty()) {
                RetryMsg(msg = currentState.error) {
                    viewModel.getData(peopleViewModel.peopleDetail.species)
                }
            } else {
                NoDataMsg(msg = "No Data")
            }
        }
    }
}