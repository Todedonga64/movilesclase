package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.edu.todedonga.R

@Preview(showBackground = true)
@Composable
fun TablaContabilidadView() {

    var colorblue by remember {
        mutableStateOf(Color.Black)
    }

    var colorred by remember {
        mutableStateOf(Color.Red)
    }

    var bold by remember {
        mutableStateOf(FontWeight.Normal)
    }

    var bandera by remember {
        mutableStateOf(R.drawable.alemania)
    }

    val n1Ingresos: Int = 2000
    val n1Egresos: Int = 500
    var resultado1 by remember {
        mutableStateOf("")
    }

    val n2Ingresos: Int = 2000
    val n2Egresos: Int = 500
    var resultado2 by remember {
        mutableStateOf("")
    }

    val n3Ingresos: Int = 2000
    val n3Egresos: Int = 500
    var resultado3 by remember {
        mutableStateOf("")
    }

    val n4Ingresos: Int = 4000
    val n4Egresos: Int = 4500
    var resultado4 by remember {
        mutableStateOf("")
    }

    val n5Ingresos: Int = 4000
    val n5Egresos: Int = 1200
    var resultado5 by remember {
        mutableStateOf("")
    }

    val n6Ingresos: Int = 4000
    val n6Egresos: Int = 3000
    var resultado6 by remember {
        mutableStateOf("")
    }

    val n7Ingresos: Int = 8000
    val n7Egresos: Int = 4500
    var resultado7 by remember {
        mutableStateOf("")
    }

    val n8Ingresos: Int = 8000
    val n8Egresos: Int = 4500
    var resultado8 by remember {
        mutableStateOf("")
    }

    val n9Ingresos: Int = 8000
    val n9Egresos: Int = 4650
    var resultado9 by remember {
        mutableStateOf("")
    }

    val n10Ingresos: Int = 12000
    val n10Egresos: Int = 6000
    var resultado10 by remember {
        mutableStateOf("")
    }

    val n11Ingresos: Int = 12000
    val n11Egresos: Int = 6000
    var resultado11 by remember {
        mutableStateOf("")
    }

    val n12Ingresos: Int = 25000
    val n12Egresos: Int = 75000
    var resultado12 by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        Column(horizontalAlignment = Alignment.End,
            modifier = Modifier
            .fillMaxWidth()
            ) {
            Image(
                painter = painterResource(id = bandera),
                contentDescription = "alemania",
                modifier = Modifier.size(100.dp)
            )
        }

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contabilidad de Alfonso Estudiante",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold)
        }

        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 135.dp)) {
            Row() {
                Text(text = "Ingresos",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(90.dp)
                        .padding(top = 5.dp))

                Text(text = "Egresos",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(80.dp)
                        .padding(top = 5.dp))

                Text(text = "Neto",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(70.dp)
                        .padding(top = 5.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Enero",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n1Ingresos",
                    fontWeight = bold,
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n1Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado1",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Febrero",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n2Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n2Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado2",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Marzo",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n3Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n3Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado3",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Abril",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n4Ingresos",
                    fontWeight = bold,
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n4Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado4",
                    color = colorred,
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Mayo",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n5Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n5Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado5",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Junio",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n6Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n6Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado6",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Julio",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n7Ingresos",
                    fontWeight = bold,
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n7Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado7",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Agosto",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n8Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n8Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado8",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Septiembre",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n9Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n9Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado9",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Octubre",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n10Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n10Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado10",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Noviembre",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n11Ingresos",
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n11Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado11",
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Diciembre",
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Green)
                        .width(135.dp)
                        .padding(top = 5.dp))

                Text(text = "$n12Ingresos",
                    color = colorblue,
                    fontWeight = bold,
                    modifier = Modifier
                        .width(90.dp))

                Text(text = "$n12Egresos",
                    modifier = Modifier
                        .width(80.dp))

                Text(text = "$resultado12",
                    color = colorred,
                    modifier = Modifier
                        .width(70.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(text = "Servicio ofrecido por",
                style = TextStyle(fontStyle = FontStyle.Italic),
                fontSize = 20.sp)
            Text(text = "RayMundo-ISND",
                style = TextStyle(textDecoration = TextDecoration.Underline))
        }

        Button(onClick = {

            bandera = R.drawable.mexico
            colorblue = Color.Blue
            bold = FontWeight.Bold

            resultado1 = (n1Ingresos - n1Egresos).toString()
            resultado2 = (n2Ingresos - n2Egresos).toString()
            resultado3 = (n3Ingresos - n3Egresos).toString()
            resultado4 = (n4Ingresos - n4Egresos).toString()
            resultado5 = (n5Ingresos - n5Egresos).toString()
            resultado6 = (n6Ingresos - n6Egresos).toString()
            resultado7 = (n7Ingresos - n7Egresos).toString()
            resultado8 = (n8Ingresos - n8Egresos).toString()
            resultado9 = (n9Ingresos - n9Egresos).toString()
            resultado10 = (n10Ingresos - n10Egresos).toString()
            resultado11 = (n11Ingresos - n11Egresos).toString()
            resultado12 = (n12Ingresos - n12Egresos).toString()
                         },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Resultados")
        }
    }
}