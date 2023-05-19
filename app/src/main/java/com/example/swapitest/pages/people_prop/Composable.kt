package com.example.swapitest.pages.people_prop

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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