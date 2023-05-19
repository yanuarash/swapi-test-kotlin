package com.example.swapitest.pages.people_detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.swapitest.models.PeopleResult

@Composable
fun ListPeopleDetailItem(item: PeopleResult) {
    Card(backgroundColor = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {}) {
        Box(
            modifier = Modifier
                .fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PeopleDetailItem(title = "Height", value = item.height)
                Divider(color = Color.Gray)
                PeopleDetailItem(title = "Mass", value = item.mass)
                Divider(color = Color.Gray)
                PeopleDetailItem(title = "Hair Color", value = item.hairColor)
                Divider(color = Color.Gray)
                PeopleDetailItem(title = "Skin Color", value = item.skinColor)
                Divider(color = Color.Gray)
                PeopleDetailItem(title = "Eye Color", value = item.eyeColor)
            }
        }
    }
}

@Composable
fun PeopleDetailItem(title: String, value: String) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(text = title, color = Color.LightGray)
        Text(text = value, color = Color.White, fontWeight = FontWeight.Bold)
    }
}