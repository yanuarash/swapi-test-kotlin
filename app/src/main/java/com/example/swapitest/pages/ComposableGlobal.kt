package com.example.swapitest.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RetryMsg(msg: String, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(modifier = Modifier.padding(horizontal = 16.dp), text = msg)
            Spacer(modifier = Modifier.padding(8.dp))
            Button(onClick = onClick) {
                Text(text = "Retry")
            }
        }
    }
}

@Composable
fun NoDataMsg(msg: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Text(text = msg)
        }
    }
}

@Composable
fun LoadingProgress(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}