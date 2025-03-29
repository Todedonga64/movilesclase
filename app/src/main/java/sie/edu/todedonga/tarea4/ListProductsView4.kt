package sie.edu.todedonga.tarea4

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListProductsView4(name: String, age: Int, height: Float, initialCash: Float) {
    val productViewModel4: ProductViewModel4 = ProductViewModel4()
    var showDialog by remember { mutableStateOf(false) }
    var cash by remember { mutableStateOf(initialCash) }

    Scaffold(

        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Text(text = "Info")
            }
        }
    ) {
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Información") },
                text = { Text("Nombre: $name, Edad: $age, Altura: $height, Dinero en Monedero: $cash") },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text("Cerrar")
                    }
                }
            )
        }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "$cash")
            LazyColumn() {
                items(productViewModel4.obtenerProductos()) { product ->
                    ProductView4(producto = product, cash) { nuevoCash -> cash = nuevoCash }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListProducstPreview() {
    val nav = rememberNavController()
    ListProductsView4("", 0, 0f, 0f)
}