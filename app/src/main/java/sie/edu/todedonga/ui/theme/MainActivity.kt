package sie.edu.todedonga.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.todedonga.actividad5.Navegacion5View
import sie.edu.todedonga.actividad6.navigation.Navegacion6View
import sie.edu.todedonga.lazylist.viewmodels.StudentViewModel
import sie.edu.todedonga.navigation.NavigationManager
import sie.edu.todedonga.preferencias.InfoView
import sie.edu.todedonga.tarea3.NavegacionLaboView
import sie.edu.todedonga.tarea4.NavigationManagerView4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodedongaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        val studentViewModel = StudentViewModel()
                        NavigationManagerView4()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TodedongaTheme {
        Greeting("Android")
    }
}