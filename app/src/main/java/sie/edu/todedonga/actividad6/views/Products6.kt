package sie.edu.todedonga.actividad6.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.edu.todedonga.R
import sie.edu.todedonga.actividad6.models6.ProductModel6

@Preview(showBackground = true)
@Composable
fun ProductPreview() {
    val product = ProductModel6(
        id = 4,
        name = "The Legend of Zelda: Breath of the Wild",
        shipping = "Free Shipping",
        label = "",
        price = 1199.0f,
        image = R.drawable.zeldabotw
    )
    Product6View(product)
}

@Composable
fun Product6View(producto: ProductModel6) {

    val textColor = if (producto.id == 4) Color.Red else Color.Black
    val textPrice = if (producto.id == 4) producto.price - (producto.price * .25) else producto.price
    val textLabel = if (producto.id == 4) "25% OFF" else ""

    Card(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
        Row(modifier = Modifier.background(color = Color.LightGray)) {
            Image(painter = painterResource(id = producto.image),
                contentDescription = producto.name,
                modifier = Modifier.size(150.dp)
            )
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = producto.name,
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "$${textPrice} MXN",
                    color = textColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = producto.shipping,
                    color = Color.Green,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold)

                Text(text = textLabel,
                    color = Color.Red,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}