package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.edu.todedonga.R

@Preview(showBackground = true)
@Composable
fun MatematicasView () {

    var numero1 by remember {
        mutableStateOf("")
    }

    var numero2 by remember {
        mutableStateOf("")
    }

    var numeroInt1 by remember {
        mutableStateOf(0)
    }

    var numeroInt2 by remember {
        mutableStateOf(0)
    }

    var numero3 by remember {
        mutableStateOf(0)
    }

    var numeroStr3 by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Dame un número")
        TextField(
            value = numero1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Aqui solo numeros") },
            onValueChange = { textoIngresado ->
                numero1 = textoIngresado
                numeroInt1 = textoIngresado.toIntOrNull() ?: 0
            })

        Text(text = "Dame un segundo número")
        TextField(
            value = numero2,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Aqui solo numeros") },
            onValueChange = { textoIngresado2 ->
                numero2 = textoIngresado2
                numeroInt2 = textoIngresado2.toIntOrNull() ?: 0
            })

        Text(text = numeroStr3,
            fontSize = 80.sp
        )

        Button(onClick = {

            numero3 = numeroInt1 + numeroInt2
            numeroStr3 = numero3.toString()

        } , modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
        )
        {
            Text(text = "Sumar")
        }

        Button(onClick = {

            numero3 = numeroInt1 - numeroInt2
            numeroStr3 = numero3.toString()

        } , modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Green)
        )
        {
            Text(text = "Restar")
        }

        IconButton(onClick = {

            numero3 = numeroInt1 * numeroInt2
            numeroStr3 = numero3.toString()

        } , modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.ic_android_black_24dp),
                contentDescription = "icono",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(80.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.steelers),
            contentDescription = "steelers",
            modifier = Modifier
                .size(180.dp)
                .clickable {
                    numero3 = numeroInt1 / numeroInt2
                    numeroStr3 = numero3.toString()
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MayorMenorView() {

    var numero1 by remember {
        mutableStateOf("")
    }

    var numero2 by remember {
        mutableStateOf("")
    }

    var numeroInt1 by remember {
        mutableStateOf(0)
    }

    var numeroInt2 by remember {
        mutableStateOf(0)
    }

    var numero3 by remember {
        mutableStateOf("")
    }

    var numeroInt3 by remember {
        mutableStateOf(0)
    }

    var mayor by remember {
        mutableStateOf(0)
    }

    var menor by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Dame un número")
        TextField(
            value = numero1,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Aqui solo numeros") },
            onValueChange = { textoIngresado ->
                numero1 = textoIngresado
                numeroInt1 = textoIngresado.toIntOrNull() ?: 0
            })

        Text(text = "Dame un segundo número")
        TextField(
            value = numero2,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Aqui solo numeros") },
            onValueChange = { textoIngresado2 ->
                numero2 = textoIngresado2
                numeroInt2 = textoIngresado2.toIntOrNull() ?: 0
            })

        Text(text = "Dame un tercer número")
        TextField(
            value = numero3,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Aqui solo numeros") },
            onValueChange = { textoIngresado3 ->
                numero3 = textoIngresado3
                numeroInt3 = textoIngresado3.toIntOrNull() ?: 0
            })

        Button(onClick = {
            if (numeroInt1 >= numeroInt2 && numeroInt1 >= numeroInt3) {
                mayor = numeroInt1
            } else if (numeroInt2 >= numeroInt1 && numeroInt2 >= numeroInt3) {
                mayor = numeroInt2
            } else {
                mayor = numeroInt3
            }
            if (numeroInt1 <= numeroInt2 && numeroInt1 <= numeroInt3) {
                menor = numeroInt1
            } else if (numeroInt2 <= numeroInt1 && numeroInt2 <= numeroInt3) {
                menor = numeroInt2
            } else {
                menor = numeroInt3
            }
        }
        ) {
            Text(text = "Identificar el mayor y menor")
        }

        Text(text = "Número mayor: " + mayor)
        Text(text = "Número menor: " + menor)
    }
}