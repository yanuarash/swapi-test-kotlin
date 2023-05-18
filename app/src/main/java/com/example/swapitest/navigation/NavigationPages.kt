package com.example.swapitest.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.swapitest.models.PeopleResult
import com.example.swapitest.pages.people.PeoplePage
import com.example.swapitest.pages.people.PeopleViewModel
import com.example.swapitest.pages.people_detail.PeopleDetailItem
import com.example.swapitest.pages.people_detail.PeopleDetailPage
import com.example.swapitest.pages.people_prop.PeoplePropPage
import org.koin.androidx.compose.getViewModel

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun NavigationPages(navHostController: NavHostController) {
    val peopleViewModel: PeopleViewModel = getViewModel();

    NavHost(navController = navHostController, startDestination = NavigationItem.People.route) {
        composable(NavigationItem.People.route) {
            PeoplePage(navHostController = navHostController, viewModel = peopleViewModel)
        }

        composable(NavigationItem.PeopleDetail.route) {
            PeopleDetailPage(navHostController = navHostController, viewModel = peopleViewModel)
        }

        composable(NavigationItem.PeopleProp.route) {
            PeoplePropPage(peopleViewModel = peopleViewModel)
        }
    }
}