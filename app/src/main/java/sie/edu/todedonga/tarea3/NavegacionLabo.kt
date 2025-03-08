package sie.edu.todedonga.tarea3

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
fun NavegacionLaboView() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "home") { //label
            HomeLaboView(navController)
        }

        composable(route = "student/{nombre}/{id}",
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
            Tarea3View(studentId, studentName)
        }
    }
}