package sie.edu.todedonga.tarea4

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import sie.edu.todedonga.navigation.HomeView

@Composable
fun DataStoreView(navegar: NavController) {
    val context = LocalContext.current
    val storedata = StoreData(context)
    val corroutine = rememberCoroutineScope()

    val savedAge by storedata.age.collectAsState(initial = 0)
    val savedName by storedata.name.collectAsState(initial = "")
    val savedHeight by storedata.height.collectAsState(initial = 0f)
    val savedCash by storedata.cash.collectAsState(initial = 0f)

    var name by remember{ mutableStateOf("") }
    var age by remember{ mutableStateOf("") }
    var height by remember{ mutableStateOf("") }
    var cash by remember{ mutableStateOf("") }

    var checked by remember { mutableStateOf(true) }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ingrese la información que se le solicita:")
        TextField(value = name, onValueChange = {name = it}, placeholder = {Text(text ="Nombre")})
        TextField(value = age, onValueChange = {age = it}, placeholder = {Text(text ="Edad")}, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = height, onValueChange = {height = it}, placeholder = {Text(text ="Altura")}, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        TextField(value = cash, onValueChange = {cash = it}, placeholder = {Text(text ="Dinero en Monedero")}, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )

        Button(onClick = {
            if (checked) {
                corroutine.launch {
                    try {
                        val ageInt = age.toIntOrNull() ?: 0
                        val heightFloat = height.toFloatOrNull() ?: 0f
                        val cashFloat = cash.toFloatOrNull() ?: 0f

                        storedata.savePersonData(name, ageInt, heightFloat, cashFloat)

                        withContext(Dispatchers.Main) {
                            navegar.navigate("products/${name}/${ageInt}/${heightFloat.toString()}/${cashFloat.toString()}")
                        }
                    } catch (e: Exception) {
                        withContext(Dispatchers.Main) {
                            Toast.makeText(context, "Error en los datos ingresados", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            } else {
                if (cash.isNotEmpty()) {
                    val cashFloat = cash.toFloatOrNull() ?: 0f
                    navegar.navigate("products/${name}/${age}/${height}/${cashFloat}")
                } else {
                    Toast.makeText(
                        context,
                        "Debes activar el switch y al menos poner una cantidad en Dinero en monedero para continuar",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }) {
            Text(text = "Siguiente")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DataStorePreview() {
    val nav = rememberNavController()
    DataStoreView(nav)
}