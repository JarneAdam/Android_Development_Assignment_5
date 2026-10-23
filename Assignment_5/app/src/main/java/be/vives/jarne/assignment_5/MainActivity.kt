package be.vives.jarne.assignment_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import be.vives.jarne.assignment_5.ui.ToDoApp
import be.vives.jarne.assignment_5.ui.theme.Assignment_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment_5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ToDoApp(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}
