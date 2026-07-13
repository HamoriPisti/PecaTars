package com.example.pecatars.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pecatars.R
import com.example.pecatars.model.PackingList
import com.example.pecatars.ui.components.ScreenContainer

@Composable
fun PackingListScreen (packingList: PackingList){

    ScreenContainer {
        Text(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            text = packingList.name)

        if (packingList.items.isEmpty()) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = stringResource(R.string.empty_packing_list)
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ){

                items(packingList.items) { item ->
                    Text(modifier = Modifier.padding(16.dp),
                        text = item.name
                    )
                }
            }
        }
    }
}