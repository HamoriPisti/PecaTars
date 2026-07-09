package com.example.pecatars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pecatars.ui.theme.PecaTarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PecaTarsTheme {
                Surface() {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column() {
        MenuCard("Peca Társ")
        MenuCard("Pakolás segéd")
        MenuCard("Fogások")
        MenuCard("Horgászhelyek")
        MenuCard("Felszerelések")
        MenuCard("Beállítások")
    }
}

@Composable
fun MenuCard(menuText: String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Text(text = menuText)
    }
}
