package sie.edu.todedonga.actividad6.viewmodels6

import androidx.lifecycle.ViewModel
import sie.edu.todedonga.R
import sie.edu.todedonga.actividad6.models6.CategoryModel6

class CategoryViewModel6() : ViewModel() {

    fun Categorias(): List<CategoryModel6> {
        var nitendo =
            CategoryModel6(
                id = 1, name = "Nintendo Switch",
                image = R.drawable.nintendologo
            )

        var playstation =
            CategoryModel6(
                id = 2, name = "Play Station 5",
                image = R.drawable.ps5logo
            )

        var xbox =
            CategoryModel6(
                id = 3, name = "Xbox Series X",
                image = R.drawable.xboxlogo
            )

        var amiibo =
            CategoryModel6(
                id = 4, name = "Amiibo",
                image = R.drawable.amiibologo
            )

        var funko =
            CategoryModel6(
                id = 5, name = "Funko Pop!",
                image = R.drawable.funkologo
            )

        var categoryList = listOf<CategoryModel6>(
            nitendo,
            playstation,
            xbox,
            amiibo,
            funko,
        )
        return categoryList
    }

}