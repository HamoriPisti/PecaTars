package com.example.pecatars.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pecatars.model.PackingList
import com.example.pecatars.ui.components.ListCard

@Composable
fun PackingScreen (){
    val lists = listOf(
        PackingList(1, "Method feeder"),
        PackingList(2, "Úszós peca"),
        PackingList(3, "Pergetés")
    )
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(lists) { packingList ->
            ListCard(
                packingList = packingList)
        }
    }

}