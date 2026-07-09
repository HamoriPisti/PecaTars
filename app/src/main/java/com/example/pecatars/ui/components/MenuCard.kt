package com.example.pecatars.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuCard(menuText: String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        onClick = {}) {
        Text(text = menuText,
            modifier = Modifier.padding(16.dp))
    }
}