package sie.edu.todedonga.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.edu.todedonga.R

@Preview(showBackground = true)
@Composable
fun BotonesView() {

    // imperativo var texto :String = "Centro"

    //declarativo
    var texto by remember {
        mutableStateOf("Que hay?")
    }

    var cambio by remember {
        mutableStateOf(false)
    }

    var color1 by remember {
        mutableStateOf(Color.Green)
    }

    Box(
        modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White))
    {

        Image(
            painter = painterResource(id = R.drawable.steelers),
            contentDescription = "steelers",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(180.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_android_black_24dp),
            contentDescription = "icono",
            tint = Color.Unspecified,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(80.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
            .align(Alignment.Center)
            .fillMaxWidth()) {

            HorizontalDivider()

            Text(text = texto,
                textAlign = TextAlign.Center)

            HorizontalDivider()

            Button(onClick = {
                if(!cambio) {
                    texto = "Hola a todos"
                } else {
                    texto = "Que hay?"
                }
                cambio = !cambio

            } , modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Green
                )
            )
            {
                Text(text = "Cambiar texto")
                ///contenido
            }
        }

        Text(
            text = "BottomCenter",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier =
            Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(color = Color.Black)
        )

    }
}