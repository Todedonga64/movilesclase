package sie.edu.todedonga.actividad5

import androidx.compose.foundation.Image
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import sie.edu.todedonga.R

@Composable
fun Actividad5View(edadInt: Int) {

    val mensaje = when (edadInt) {
        in 0..14 -> "menor de edad"
        15 -> "mayor de edad en Indonesia pero no en México"
        16 -> "mayor de edad en Cuba pero no en México"
        17 -> "mayor de edad en Corea del Norte pero no en México"
        18 -> "mayor de edad en México y gran parte de Latinoamérica"
        19 -> "mayor de edad en Corea del Sur"
        20 -> "mayor de edad en Japón"
        in 21..59 -> "mayor de edad en USA y posiblemente en todo el mundo"
        in 60..64 -> "eres de la tercera edad"
        in 65..200 -> "ya te puedes jubilar"
        else -> "Edad no válida"
    }

    val imagen = when (edadInt) {
        in 0..14 -> R.drawable.nino
        15 -> R.drawable.joven
        16 -> R.drawable.joven
        17 -> R.drawable.joven
        18 -> R.drawable.joven
        19 -> R.drawable.joven
        20 -> R.drawable.joven
        in 21..59 -> R.drawable.joven
        in 60..64 -> R.drawable.viejo
        in 65..200 -> R.drawable.viejo
        else -> R.drawable.steelers
    }
    Card {
        Text(text = mensaje)
        Image(painter = painterResource(id = imagen),
            contentDescription = "edad")
    }
}