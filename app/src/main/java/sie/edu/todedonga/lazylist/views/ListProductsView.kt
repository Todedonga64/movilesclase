package sie.edu.todedonga.lazylist.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.todedonga.lazylist.viewmodels.ProductViewModel

@Preview(showBackground = true)
@Composable
fun ListProductsView() {
    val productViewModel: ProductViewModel = ProductViewModel()

    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn() {

            items(productViewModel.obtenerProductos()) { product ->
                //van los componentes/vistas
                ProductView(producto = product)
            }

            item {
                Button(onClick = { }) {
                    Text(text = "Terminar compra")
                }
            }

        }
    }
}