package sie.edu.todedonga.tarea4

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
fun NavigationManagerView4() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") { //label
            DataStoreView(navController)
        }

        composable(route = "products/{name}/{age}/{height}/{cash}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                },
                navArgument("age") {
                    type = NavType.IntType
                },
                navArgument("height") {
                    type = NavType.StringType
                },
                navArgument("cash") {
                    type = NavType.StringType
                }
            )
        )
        { parametros ->
            val Name = parametros.arguments?.getString("name") ?: ""
            val Age = parametros.arguments?.getInt("age") ?: 0
            val Height = parametros.arguments?.getString("height")?.toFloatOrNull() ?: 0f
            val Cash = parametros.arguments?.getString("cash")?.toFloatOrNull() ?: 0f
            ListProductsView4(Name, Age, Height, Cash)
        }
    }
}