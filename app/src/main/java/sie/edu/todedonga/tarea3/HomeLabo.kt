package sie.edu.todedonga.tarea3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import sie.edu.todedonga.R

@Composable
fun HomeLaboView(navegar: NavController) {

    var nombre by remember {
        mutableStateOf("")
    }

    var id by remember {
        mutableStateOf("")
    }

    var idInt by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Bienvenido")

        Spacer(modifier = Modifier.height(4.dp))

        TextField(value = nombre,
            placeholder = {Text(text ="Nombre")},
            onValueChange = { nombre = it })
        TextField(value = id,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {Text(text ="ID")},
            onValueChange = { idStr ->
            id = idStr
            idInt = idStr.toIntOrNull() ?: 0
        })

        Spacer(modifier = Modifier.height(4.dp))

        ExtendedFloatingActionButton(onClick = {
            navegar.navigate("student/$nombre/$id")
        }) {
            Text(text = "Go")
        }

        val rainbowColorsBrush = remember {
            Brush.sweepGradient(
                listOf(
                    Color(0xFF9575CD),
                    Color(0xFFBA68C8),
                    Color(0xFFE57373),
                    Color(0xFFFFB74D),
                    Color(0xFFFFF176),
                    Color(0xFFAED581),
                    Color(0xFF4DD0E1),
                    Color(0xFF9575CD)
                )
            )
        }
        val borderWidth = 4.dp

        Spacer(modifier = Modifier.height(4.dp))

        Image(
            painter = painterResource(id = R.drawable.steelers),
            contentDescription = "Steelers",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .border(
                    BorderStroke(borderWidth, rainbowColorsBrush),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
    }
}

