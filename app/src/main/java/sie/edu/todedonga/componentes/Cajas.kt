package sie.edu.todedonga.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.edu.todedonga.R

@Preview(showBackground = true)
@Composable
fun CajasView() {
    Box(modifier = Modifier
        .background(Color.Yellow)
        .size(254.dp)
        // .fillMaxSize()
    ){

        Image(painter = painterResource(id = R.drawable.steelers),
            contentDescription = "steelers",
            modifier = Modifier.fillMaxSize().rotate(180f),
            contentScale = ContentScale.Crop,
            alpha = 0.8f
        )

        Text(text = "BottomEnd",
            modifier =
            Modifier.align(Alignment.BottomEnd))
        Text(text = "Center",
            modifier =
            Modifier.align(Alignment.Center))
        Text(text = "BottomCenter",
            modifier =
            Modifier.align(Alignment.BottomCenter))
        Text(text = "BottomStart",
            modifier =
            Modifier.align(Alignment.BottomStart))
        Text(text = "TopEnd",
            modifier =
            Modifier.align(Alignment.TopEnd))
        Text(text = "CenterEnd",
            modifier =
            Modifier.align(Alignment.CenterEnd))
        Text(text = "TopStart",
            modifier =
            Modifier.align(Alignment.TopStart))
        Text(text = "TopCenter",
            modifier =
            Modifier.align(Alignment.TopCenter))
        Text(text = "CenterStart",
            modifier =
            Modifier.align(Alignment.CenterStart))

        Icon(imageVector = Icons.Filled.AccessTime,
            contentDescription = "icono",
            tint = Color.Green
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_android_black_24dp),
            contentDescription = "icono",
            modifier = Modifier.align(Alignment.BottomCenter),
            tint = Color.Unspecified
        )
    }
}