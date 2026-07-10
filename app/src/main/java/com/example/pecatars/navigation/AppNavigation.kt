package com.example.pecatars.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pecatars.ui.screens.HomeScreen
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
        composable("packing") { PackingScreen() }
    }
}