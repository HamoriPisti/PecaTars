package com.example.pecatars.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pecatars.sample.SampleData
import com.example.pecatars.ui.screens.HomeScreen
import com.example.pecatars.ui.screens.PackingListScreen
import com.example.pecatars.ui.screens.PackingScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "home"
    ) {
      composable("home") {
          HomeScreen(
              onPackingClick = {
                navController.navigate("packing")
              }
          )
      }
        composable("packing") {
            PackingScreen(
                SampleData.packingLists,
                onPackingListClick = {
                listId -> navController.navigate("packing/$listId")
                }
            )
        }
        composable("packing/{listId}") { backStackEntry ->

            val listId = backStackEntry
                .arguments
                ?.getString("listId")
                ?.toInt()

            val packingList = SampleData.packingLists.find { it.id == listId }

            packingList?.let {
                PackingListScreen(packingList = it)
            }
        }
    }
}