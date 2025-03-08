package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun examen() {
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.White)
        .padding(10.dp))
    {
        Column() {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Box(modifier = Modifier
                        .background(color = Color.Green)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Column() {
                        Box(modifier = Modifier
                            .background(color = Color.Green)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Box(modifier = Modifier
                            .background(color = Color.Green)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Box(modifier = Modifier
                        .background(color = Color.Green)
                        .width(80.dp)
                        .height(202.dp)) {

                    }

                }
                Box(modifier = Modifier
                    .background(color = Color.DarkGray)
                    .fillMaxWidth()
                    .height(6.dp)) {

                }
            }

            Column(modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Box(modifier = Modifier
                        .background(color = Color.Green)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Column() {
                        Box(modifier = Modifier
                            .background(color = Color.Green)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Box(modifier = Modifier
                            .background(color = Color.Green)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Box(modifier = Modifier
                        .background(color = Color.Green)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                }
            }
        }
    }
}