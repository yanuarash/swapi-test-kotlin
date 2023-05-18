package com.example.swapitest.pages.people_detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.swapitest.pages.people.PeopleItem
import com.example.swapitest.pages.people.PeopleViewModel
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.koinViewModel

@ExperimentalMaterialApi
@Composable
fun PeopleDetailPage(viewModel: PeopleViewModel, navHostController: NavHostController) {
    val peopleDetail = viewModel.peopleDetail

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "People") })
    }) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            Column {
                Card(backgroundColor = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .height(100.dp)
                        .clickable {}) {
                    Box(contentAlignment = Alignment.Center) {
                        Column() {
                            Text(
                                text = peopleDetail.name,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(all = 8.dp),
                                color = Color.White
                            )
                            Text(
                                text = peopleDetail.birthYear,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(all = 8.dp),
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
//               ListPeopleDetailItem(item = )
            }
        }
    }
}

@Composable
fun ListPeopleDetailItem(item: PeopleResult) {
    PeopleDetailItem(title = "Height", value = item.height)
    PeopleDetailItem(title = "Mass", value = item.mass)
    PeopleDetailItem(title = "Hair Color", value = item.hairColor)
    PeopleDetailItem(title = "Skin Color", value = item.skinColor)
    PeopleDetailItem(title = "Eye Color", value = item.eyeColor)
    PeopleDetailItem(title = "Gender", value = item.gender)
}

@Composable
fun PeopleDetailItem(title: String, value: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = title, color = Color.DarkGray)
        Text(text = value)
        Divider(modifier = Modifier.padding(vertical = 2.dp))
    }
}