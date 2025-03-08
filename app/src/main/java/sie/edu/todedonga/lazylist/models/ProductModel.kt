package sie.edu.todedonga.lazylist.models

import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int,
    val name: String,
    val description: String?, //? Optional "hola" null ""
    val price: Float,
    @DrawableRes val image: Int //0,1,100, null
)
