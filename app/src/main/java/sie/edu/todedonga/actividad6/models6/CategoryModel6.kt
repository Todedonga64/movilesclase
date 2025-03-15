package sie.edu.todedonga.actividad6.models6

import androidx.annotation.DrawableRes

data class CategoryModel6 (
    val id: Int,
    val name: String,
    @DrawableRes val image: Int //0,1,100, null
)