package com.example.swapitest.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.swapitest.pages.people.PeoplePage

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun NavigationPages(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = NavigationItem.People.route) {
        composable(NavigationItem.People.route) {
            PeoplePage(navHostController = navHostController)
        }
    }
}