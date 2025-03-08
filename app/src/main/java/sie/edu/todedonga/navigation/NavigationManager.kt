package sie.edu.todedonga.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import sie.edu.todedonga.componentes.BotonesView

@Preview(showBackground = true)
@Composable
fun NavigationManager() {

    val home = "home"

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "home") { //label
            HomeView(navController)
        }

        composable(route = "CajaDeTexto") {
            BotonesView(navController)
        }

        composable(route = "estudiante/{nombre}/{id}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                }, ///hasta primer parametro
                navArgument("id") {
                    type = NavType.IntType
                } //termina 2do parametro
            ) //termina lista de parametros
        )
        { parametros ->

            val studentName = parametros.arguments?.getString("nombre") ?: ""
            val studentId = parametros.arguments?.getInt("id") ?: 0
            StudentView(studentId, studentName)
        }

        composable(route = "estudiante” + ?id={id}&nombre={nombre}",

            arguments = listOf(navArgument("id") {
                type = NavType.IntType
                defaultValue = 0
            },
                navArgument("nombre") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                }
            )
        ) {
            backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            val nombre = backStackEntry.arguments?.getString("nombre") ?: "*"
            StudentView(id, nombre)
            /////
        }
    }
}