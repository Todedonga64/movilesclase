package sie.edu.todedonga.actividad6.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import sie.edu.todedonga.actividad6.views.CategoryList6View
import sie.edu.todedonga.actividad6.views.Products6View

@Preview(showBackground = true)
@Composable
fun Navegacion6View() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "categories"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "categories") { //label
            CategoryList6View(navController)
        }

        composable("products/{categoryId}")
        { parametros ->
            val categoryId = parametros.arguments?.getString("categoryId")
            Products6View(categoryId)
        }
    }
}