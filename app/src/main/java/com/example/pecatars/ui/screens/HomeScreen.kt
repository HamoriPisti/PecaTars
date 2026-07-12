package com.example.pecatars.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pecatars.ui.components.MenuCard
import com.example.pecatars.ui.components.ScreenContainer

@Composable
fun HomeScreen(
    onPackingClick: () -> Unit
) {
    ScreenContainer {
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