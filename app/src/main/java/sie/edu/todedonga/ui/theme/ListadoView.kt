package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.todedonga.compartido.TarjetaView
import sie.edu.todedonga.compartido.TerminalView

@Preview(showBackground = true)
@Composable
fun ListadoView() {

    Column(modifier = Modifier.fillMaxSize()) {
        TerminalView()
        TerminalView()
        TerminalView()

        TarjetaView()
        TarjetaView(colorText = Color.Blue)
        TarjetaView(background = Color.Blue)
        TarjetaView(colorText = Color.Green,
            background = Color.Blue)
        TarjetaView(Color.LightGray, Color.Magenta)
        TarjetaView(texto = "hola")
    }

}