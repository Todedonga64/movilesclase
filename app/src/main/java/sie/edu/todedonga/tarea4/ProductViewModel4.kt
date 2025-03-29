package sie.edu.todedonga.tarea4

import androidx.lifecycle.ViewModel
import sie.edu.todedonga.R

class ProductViewModel4() : ViewModel() {

    fun obtenerProductos(): List<ProductModel4> {
        var productoUno =
            ProductModel4(
                id = 1, name = "sushi",
                description = "3 rollos",
                price = 90.0f,
                image = R.drawable.sushi
            )

        var productoDos =
            ProductModel4(
                id = 2, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 70.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoTres =
            ProductModel4(
                id = 3, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 200.0f,
                image = R.drawable.westernbacon
            )

        var productoCuatro =
            ProductModel4(
                id = 4, name = "sushi",
                description = "3 rollos",
                price = 90.0f,
                image = R.drawable.sushi
            )

        var productoCinco =
            ProductModel4(
                id = 5, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 70.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoSeis =
            ProductModel4(
                id = 6, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 200.0f,
                image = R.drawable.westernbacon
            )

        var productoSiete =
            ProductModel4(
                id = 7, name = "sushi",
                description = "3 rollos",
                price = 90.0f,
                image = R.drawable.sushi
            )

        var productoOcho =
            ProductModel4(
                id = 8, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 70.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoNueve =
            ProductModel4(
                id = 9, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 200.0f,
                image = R.drawable.westernbacon
            )

        var productoDiez =
            ProductModel4(
                id = 10, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 200.0f,
                image = R.drawable.westernbacon
            )

        var productsList = listOf<ProductModel4>(
            productoUno,
            productoDos,
            productoTres,
            productoCuatro,
            productoCinco,
            productoSeis,
            productoSiete,
            productoOcho,
            productoNueve,
            productoDiez
        )
        return productsList
    }
}
