package sie.edu.todedonga.actividad6.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import sie.edu.todedonga.actividad6.viewmodels6.CategoryViewModel6

@Composable
fun CategoryList6View(navController: NavController) {

    val categoryViewModel6: CategoryViewModel6 = CategoryViewModel6()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyRow() {
            items(categoryViewModel6.Categorias()) { category ->
                Category6View(categoria = category, navController)
            }
        }
    }
}