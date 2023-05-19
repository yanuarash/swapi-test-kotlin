package com.example.swapitest.navigation

sealed class NavigationItem (var route: String, var title: String){
    object People : NavigationItem("people", "People");
    object PeopleDetail : NavigationItem("peopleDetail", "PeopleDetail");
    object PeopleProp : NavigationItem("peopleProp", "PeopleProp");
    object VehicleProp : NavigationItem("vehicleProp", "VehicleProp");
    object StarshipProp : NavigationItem("starshipProp", "StarshipProp");
    object SpeciesProp : NavigationItem("speciesProp", "SpeciesProp");
}