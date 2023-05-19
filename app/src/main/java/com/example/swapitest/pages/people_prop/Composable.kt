package com.example.swapitest.pages.people_prop

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.swapitest.pages.LoadingProgress
import com.example.swapitest.pages.NoDataMsg
import com.example.swapitest.pages.RetryMsg

@ExperimentalMaterialApi
@Composable
fun ListData(list: List<String>) {
    Column {
        LazyColumn {
            items(list) { item ->
                PeoplePropItem(item = item)
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