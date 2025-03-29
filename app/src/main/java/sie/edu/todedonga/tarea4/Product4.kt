package sie.edu.todedonga.tarea4

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.edu.todedonga.R
import sie.edu.todedonga.lazylist.models.ProductModel

@Preview(showBackground = true)
@Composable
fun ProductPreview4() {
    val product = ProductModel4(
        id = 1,
        name = "Enchiladas Suizas",
        description = null,
        price = 90.0f,
        image = R.drawable.enchiladassuizas
    )
}

@Composable
fun ProductView4(producto: ProductModel4, cash: Float, actualizarCash: (Float) -> Unit) {
    val context = LocalContext.current

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = producto.image),
                contentDescription = producto.description,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
                )

            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = producto.name, fontSize = 18.sp)
                Text(text = producto.description ?: "Sin descripcion",
                    fontSize = 10.sp,
                        color = Color.Blue
                )

                Text(text = "${producto.price} MXN")

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {
                    Box() {
                        Button(onClick = {
                            if (cash >= producto.price) {
                                actualizarCash(cash - producto.price)
                            } else {
                                Toast.makeText(context, "No tienes suficiente dinero", Toast.LENGTH_SHORT).show()
                            }
                        }) {
                            Text(text = "Comprar")
                        }
                    }
                }
            }
        }
    }
}