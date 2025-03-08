package sie.edu.todedonga.lazylist.viewmodels

import androidx.lifecycle.ViewModel
import sie.edu.todedonga.R
import sie.edu.todedonga.lazylist.models.ProductModel

class ProductViewModel() : ViewModel() {

    init {
        // obtenerProductos()
    }

    fun obtenerProductos(): List<ProductModel> {
        var productoUno =
            ProductModel(
                id = 1, name = "sushi",
                description = "3 rollos",
                price = 90.0f,
                image = R.drawable.sushi
            )

        var productoDos =
            ProductModel(
                id = 2, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 30.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoTres =
            ProductModel(
                id = 3, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 200.0f,
                image = R.drawable.westernbacon
            )

        var productoCuatro =
            ProductModel(
                id = 4, name = "sushi",
                description = "3 rollos",
                price = 5.0f,
                image = R.drawable.sushi
            )

        var productoCinco =
            ProductModel(
                id = 5, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 5.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoSeis =
            ProductModel(
                id = 6, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 5.0f,
                image = R.drawable.westernbacon
            )

        var productoSiete =
            ProductModel(
                id = 7, name = "sushi",
                description = "3 rollos",
                price = 5.0f,
                image = R.drawable.sushi
            )

        var productoOcho =
            ProductModel(
                id = 8, name = "enchiladas suizas",
                description = "3 enchiladas",
                price = 5.0f,
                image = R.drawable.enchiladassuizas
            )

        var productoNueve =
            ProductModel(
                id = 9, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 5.0f,
                image = R.drawable.westernbacon
            )

        var productoDiez =
            ProductModel(
                id = 10, name = "double western bacon",
                description = "1 hamburguesa + papas + refresco",
                price = 5.0f,
                image = R.drawable.westernbacon
            )

        var productsList = listOf<ProductModel>(
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
