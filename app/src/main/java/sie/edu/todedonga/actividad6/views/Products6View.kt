package sie.edu.todedonga.actividad6.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import sie.edu.todedonga.actividad6.viewmodels6.ProductViewModel6

@Composable
fun Products6View(id: String?) {

    val categoryId: Int = id?.toInt() ?: 0
    val productsViewModel6: ProductViewModel6 = ProductViewModel6()

    if(categoryId == 1) {
        LazyColumn() {
            items(productsViewModel6.ProductosNitendo()) { product ->
                Product6View(producto = product)
            }
        }
    } else if (categoryId == 2) {
        LazyColumn() {
            items(productsViewModel6.ProductosPlayStation()) { product ->
                Product6View(producto = product)
            }
        }
    } else if (categoryId == 3) {
        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(2.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(productsViewModel6.ProductosXbox()) { product ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(2f)
                ) {
                    Product6View(producto = product)
                }
            }
        }
    } else if (categoryId == 4) {
        LazyColumn() {
            items(productsViewModel6.ProductosAmiibos()) { product ->
                Product6View(producto = product)
            }
        }
    } else {
        LazyColumn() {
            items(productsViewModel6.ProductosFunkos()) { product ->
                Product6View(producto = product)
            }
        }
    }
}