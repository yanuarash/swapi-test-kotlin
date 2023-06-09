package com.example.swapitest.pages.people_detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.swapitest.models.PeopleResult
import com.example.swapitest.navigation.NavigationItem
import com.example.swapitest.pages.people.PeopleViewModel

@ExperimentalMaterialApi
@Composable
fun PeopleDetailPage(viewModel: PeopleViewModel, navHostController: NavHostController) {
    val peopleDetail = viewModel.peopleDetail

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "People") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                PeopleName(peopleDetail = peopleDetail)
                Row {
                    ButtonPeopleProp(title = "Film", modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                        .clickable {
                            navHostController.navigate(NavigationItem.PeopleProp.route)
                        })
                    ButtonPeopleProp(
                        title = "Vehicle",
                        modifier = Modifier
                            .padding(8.dp)
                            .weight(1f)
                            .clickable {
                                navHostController.navigate(NavigationItem.VehicleProp.route)
                            })
                }
                Row {
                    ButtonPeopleProp(
                        title = "Starship",
                        modifier = Modifier
                            .padding(8.dp)
                            .weight(1f)
                            .clickable {
                                navHostController.navigate(NavigationItem.StarshipProp.route)
                            })
                    ButtonPeopleProp(
                        title = "Species",
                        modifier = Modifier
                            .padding(8.dp)
                            .weight(1f)
                            .clickable {
                                navHostController.navigate(NavigationItem.SpeciesProp.route)
                            })
                }
                Text(
                    text = "Detail",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                )
                ListPeopleDetailItem(item = peopleDetail)
            }
        }
    }
}

@Composable
fun PeopleName(peopleDetail: PeopleResult) {
    Card(backgroundColor = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(100.dp)
            .clickable {}) {
        Box(
            modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = peopleDetail.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(all = 4.dp),
                    color = Color.White
                )
                Text(
                    text = "${peopleDetail.birthYear} | ${peopleDetail.gender}",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(all = 4.dp),
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun ButtonPeopleProp(title: String, modifier: Modifier) {
    Card(
        backgroundColor = Color.Black, modifier = modifier
    ) {
        Box(modifier = Modifier.padding(8.dp), contentAlignment = Alignment.Center) {
            Text(
                text = title,
                fontSize = 20.sp,
                modifier = Modifier.padding(all = 8.dp),
                color = Color.White
            )
        }
    }
}