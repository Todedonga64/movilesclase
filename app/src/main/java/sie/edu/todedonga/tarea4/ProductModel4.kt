package sie.edu.todedonga.tarea4

import androidx.annotation.DrawableRes

data class ProductModel4(
    val id: Int,
    val name: String,
    val description: String?,
    val price: Float,
    @DrawableRes val image: Int
)