package com.example.pecatars.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pecatars.ui.components.MenuCard

@Composable
fun HomeScreen(
    onPackingClick: () -> Unit
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(WindowInsets.safeDrawing.asPaddingValues())) {
        Text(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            text = "Peca Társ")
        MenuCard(
            "Pakolás segéd",
            onClick = onPackingClick)
        MenuCard(
            "Fogások",
            onClick = {})
        MenuCard(
            "Horgászhelyek",
            onClick = {})
        MenuCard(
            "Felszerelések",
            onClick = {})
        MenuCard(
            "Beállítások",
            onClick = {})
    }
}