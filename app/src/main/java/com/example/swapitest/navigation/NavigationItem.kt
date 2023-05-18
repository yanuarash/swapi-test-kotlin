package com.example.swapitest.navigation

sealed class NavigationItem (var route: String, var title: String){
    object People : NavigationItem("people", "People");
    object PeopleDetail : NavigationItem("peopleDetail", "PeopleDetail");
}