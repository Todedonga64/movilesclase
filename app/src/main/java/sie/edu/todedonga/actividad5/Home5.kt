package sie.edu.todedonga.actividad5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home5View(navegar: NavController) {

    var edad by remember {
        mutableStateOf("")
    }

    var edadInt by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Bienvenido")

        Spacer(modifier = Modifier.height(4.dp))

        TextField(value = edad,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {Text(text ="Edad")},
            onValueChange = { edadStr ->
            edad = edadStr
            edadInt = edadStr.toIntOrNull() ?: 0
        })

        Spacer(modifier = Modifier.height(4.dp))

        FloatingActionButton(onClick = {
            navegar.navigate("student/$edadInt")
        }) {
            Text(text = "Go")
        }
    }
}

