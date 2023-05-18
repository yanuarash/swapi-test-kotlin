package com.example.swapitest.pages.people

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.swapitest.models.PeopleResult
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@Composable
fun PeoplePage(viewModel: PeopleViewModel, navHostController: NavHostController) {
    val peopleState = viewModel.state.value
    val peopleList = peopleState.data?.results

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "People") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (peopleList != null) {
                Column() {
                    LazyColumn(
                    ) {
                        items(peopleList) { item ->
                            PeopleItem(navHostController = navHostController, item = item) {
                                viewModel.peopleDetail = item
                            }
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
fun PeopleItem(
    navHostController: NavHostController, item: PeopleResult, setPeopleDetail: () -> Unit
) {
    Card(backgroundColor = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(90.dp)
            .clickable {
                setPeopleDetail()
                navHostController.navigate("peopleDetail")
            }) {
        Text(
            text = item.name,
            fontSize = 20.sp,
            modifier = Modifier.padding(all = 8.dp),
            color = Color.White
        )
    }
}