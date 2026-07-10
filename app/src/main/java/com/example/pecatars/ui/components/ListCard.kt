package com.example.pecatars.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pecatars.model.PackingList

@Composable
fun ListCard(packingList: PackingList){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    ) {
        Text(text = packingList.name,
            modifier = Modifier.padding(16.dp))
    }
}