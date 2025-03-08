package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Number15View() {
    Box(modifier = Modifier.background(color = Color.Black)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row (modifier = Modifier.fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)) {
                    Text(text = "1",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "2",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "3",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "4",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
            }

            Row (modifier = Modifier.fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)) {
                    Text(text = "5",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "6",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "7",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "8",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
            }

            Row (modifier = Modifier.fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)) {
                    Text(text = "9",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "10",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "11",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "12",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
            }

            Row (modifier = Modifier.fillMaxWidth()
                .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)) {
                    Text(text = "13",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.White)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "14",
                        color = Color.Blue,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(modifier = Modifier
                    .background(color = Color.DarkGray)
                    .height(100.dp)
                    .width(90.dp)
                ) {

                }
                Box(modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp)
                    .width(90.dp)
                ) {
                    Text(text = "15",
                        color = Color.White,
                        fontSize = 80.sp,
                        modifier = Modifier.align(Alignment.Center))
                }
            }
        }
    }
}