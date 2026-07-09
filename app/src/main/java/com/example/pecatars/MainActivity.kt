package com.example.pecatars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.example.pecatars.ui.theme.PecaTarsTheme
import com.example.pecatars.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PecaTarsTheme {
                Surface {
                    HomeScreen()
                }
            }
        }
    }
}




