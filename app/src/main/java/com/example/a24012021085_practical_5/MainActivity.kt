package com.example.a24012021085_practical_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.a24012021085_practical_5.ui.theme._24012021085_Practical_5Theme
import com.example.a24012021085_practical_5.AppNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _24012021085_Practical_5Theme() {
                AppNavigation()
            }
        }
    }
}