package sie.edu.todedonga.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/////////////////////////////
data class MiObjeto(
    val esGrande: Boolean,
    val saludo: String,
    val redColorText: Color,
    val fontSize25: TextUnit,
    val lines: Int
)
/////////////////////////////

@Preview(showBackground = true)
@Composable
fun Holamundoview(){

    val saludos: MiObjeto = MiObjeto(
        false, "Adios mundo", Color.Red, 32.sp, 2)

    val miObjeto2: MiObjeto = MiObjeto(
        false, "Adios mundo", Color.Red, 32.sp, 2)


    val esGrande: Boolean = false
    val saludo: String = "Hola mundo desde el I.E.S.T."
    val redColorText: Color = Color.Red
    val fontSize25: TextUnit = 30.sp
    val lines: Int = 3


    Text(text = "saludos",
        color = redColorText,
        fontSize = fontSize25,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        maxLines = if(esGrande) lines else 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,

        ///nuevo (de hoy 20-Enero 2025)
        modifier = Modifier
            .background( color = Color.Cyan)
            .padding(16.dp)
            .background(color = Color.Black)
            .padding(horizontal = 8.dp)
            .background(color = Color.Gray)
            .padding(top = 6.dp)
            .background(color = Color(0xFF009688))//0x y 8 caracteres
            .border(width = 3.dp, color = Color.Magenta)
            //.fillMaxWidth() usa tod_o el ancho
            //.fillMaxHeight() usa tod_o el alto
            .fillMaxSize() //ocupa tod_o el ancho y alto
            .blur(3.dp) //difuminado de una imagen o componente
            ///Modifier.background( color = Color.Green), shape = RoundedCornerShape(25.dp)
    )
}