package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Number15View() {
    Box() {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "1",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "2",
                        color = Color.Blue)
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "3",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "4",
                        color = Color.Blue)
                }
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "1",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "2",
                        color = Color.Blue)
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "3",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "4",
                        color = Color.Blue)
                }
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "1",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "2",
                        color = Color.Blue)
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "3",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "4",
                        color = Color.Blue)
                }
            }

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "1",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "2",
                        color = Color.Blue)
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)) {
                    Text(text = "3",
                        color = Color.White)
                }
                Box(modifier = Modifier
                    .background(color = Color.White)) {
                    Text(text = "4",
                        color = Color.Blue)
                }
            }
        }
    }
}