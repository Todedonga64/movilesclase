package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PosicionesView() {
    Box(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(15.dp)
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            Box(
                modifier =
                Modifier
                    .align(Alignment.BottomEnd)
                    .background(color = Color.Yellow)
                    .width(82.dp)
                    .height(200.dp)
            ) {
                Text(text = "BottomEnd",
                        modifier =
                        Modifier
                        .align(Alignment.BottomEnd)
                )
            }
            Box(
                modifier =
                Modifier
                    .align(Alignment.Center)
                    .background(color = Color.Gray)
                    .width(75.dp)
                    .height(421.dp)
            ) {
                Text(text = "Center",
                    modifier =
                    Modifier
                        .align(Alignment.Center)
                    )
            }
            Box(
                modifier =
                Modifier
                    .align(Alignment.BottomCenter)
                    .background(color = Color.DarkGray)
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Text(text = "BottomCenter",
                    color = Color.White,
                    modifier =
                    Modifier
                        .align(Alignment.BottomCenter))

            }
            Box(
                modifier =
                Modifier
                    .align(Alignment.BottomStart)
                    .background(color = Color.Cyan)
                    .width(82.dp)
                    .height(200.dp)
            ) {
                Text(text = "BottomStart",
                    modifier =
                    Modifier
                        .align(Alignment.BottomStart))
            }
            Box(
                modifier =
                Modifier
                    .align(Alignment.TopEnd)
                    .background(color = Color.Magenta)
                    .width(116.dp)
                    .height(50.dp)
            ) {
                Text(text = "TopEnd",
                    color = Color.White)
            }
            Box(
                modifier =
                Modifier
                    .padding(bottom = 405.dp)
                    .align(Alignment.CenterEnd)
                    .width(144.dp)
                    .background(color = Color.Black)
            ) {
                Text(text = "CenterEnd",
                    color = Color.White,
                    modifier =
                    Modifier
                        .align(Alignment.CenterEnd))
            }
            Text(text = "TopStart",
                color = Color.White,
                modifier =
                Modifier
                    .align(Alignment.TopStart)
                    .background(color = Color.Red)
                    .width(117.dp)
            )
            Box(
                modifier =
                Modifier
                    .align(Alignment.TopCenter)
                    .background(color = Color.Blue)
                    .width(130.dp)
                    .height(200.dp)
            ) {
                Text(text = "TopCenter",
                    color = Color.White,
                        modifier =
                        Modifier
                        .align(Alignment.TopCenter))
            }
            Box(
                modifier =
                Modifier
                    .padding(top = 200.dp)
                    .align(Alignment.TopStart)
                    .background(color = Color.Green)
                    .width(144.dp)
                    .height(200.dp)
            ) {
                Text(text = "CenterStart",
                    modifier =
                    Modifier
                        .align(Alignment.CenterStart))
            }
        }
    }
}