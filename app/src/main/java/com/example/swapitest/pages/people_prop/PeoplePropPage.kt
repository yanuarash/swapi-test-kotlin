package com.example.swapitest.pages.people_prop

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.swapitest.pages.people.PeopleViewModel
import com.example.swapitest.pages.people_prop.viewmodel.FilmViewModel
import com.example.swapitest.pages.people_prop.viewmodel.VehicleViewModel
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun PeoplePropPage(
    viewModel: FilmViewModel = getViewModel(),
    peopleViewModel: PeopleViewModel
) {
    val peopleState = viewModel.state.value
    val list = peopleState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.films) {
        viewModel.getFilm(peopleViewModel.peopleDetail.films)
    }

    PeoplePropContent(title = "Film", list = list)
}

@ExperimentalMaterialApi
@Composable
fun VehiclePage(
    viewModel: VehicleViewModel = getViewModel(),
    peopleViewModel: PeopleViewModel
) {
    val currentState = viewModel.state.value
    val list = currentState.data

    LaunchedEffect(key1 = peopleViewModel.peopleDetail.vehicles) {
        viewModel.getFilm(peopleViewModel.peopleDetail.vehicles)
    }

    PeoplePropContent(title = "Vehicle", list = list)
}

@ExperimentalMaterialApi
@Composable
fun PeoplePropContent(title: String, list: List<String>?) {
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = title) })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (list != null) {
                Column() {
                    LazyColumn(
                    ) {
                        items(list) { item ->
                            PeoplePropItem(item = item)
                        }
                    }
                }
            } else {
                Snackbar() {
                    Text(text = "Error Fetching Data")
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun PeoplePropItem(
    item: String
) {
    Card(
        backgroundColor = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(90.dp)
    ) {
        Text(
            text = item,
            fontSize = 20.sp,
            modifier = Modifier.padding(all = 8.dp),
            color = Color.White
        )
    }
}