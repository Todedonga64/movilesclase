package sie.edu.todedonga.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColumnasView() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.LightGray)
        ,
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "hola",
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Blue))
        Text(text = "adios",
            color = Color.Yellow,
            modifier = Modifier
                .background(color = Color.Black))
        Text(text = "de nuevo",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xFF009688))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnasSeparadas() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "1")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "2")
        Spacer(modifier = Modifier.height(40.dp))
        HorizontalDivider()
        Text(text = "3")
    }
}