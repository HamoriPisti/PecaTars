package com.example.pecatars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.example.pecatars.navigation.AppNavigation
import com.example.pecatars.ui.theme.PecaTarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PecaTarsTheme {
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}




