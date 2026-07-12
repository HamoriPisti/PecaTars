package com.example.pecatars.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pecatars.model.PackingList
import com.example.pecatars.ui.components.ListCard
import com.example.pecatars.ui.components.ScreenContainer

@Composable
fun PackingScreen (){
    val lists = listOf(
        PackingList(1, "Method feeder"),
        PackingList(2, "Úszós peca"),
        PackingList(3, "Pergetés")
    )
    ScreenContainer {
        Text(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            text = "Pakolás segéd")
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ){

            items(lists) { packingList ->
                ListCard(
                    packingList = packingList)
            }
        }
    }


}