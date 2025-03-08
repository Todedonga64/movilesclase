package sie.edu.todedonga.actividad5

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun Navegacion5View() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "home") { //label
            Home5View(navController)
        }

        composable(route = "student/{edadInt}",
            arguments = listOf(
                navArgument("edadInt") {
                    type = NavType.IntType
                }
            )
        )
        { parametros ->

            val edadInt = parametros.arguments?.getInt("edadInt") ?: 0
            Actividad5View(edadInt)

        }
    }
}