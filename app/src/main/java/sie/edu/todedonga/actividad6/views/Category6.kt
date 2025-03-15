package sie.edu.todedonga.actividad6.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import sie.edu.todedonga.actividad6.models6.CategoryModel6

@Composable
fun Category6View(categoria: CategoryModel6, navController: NavController) {
    Card(modifier = Modifier
        .width(300.dp)
        .height(200.dp)
        .padding(15.dp),
        onClick = {
            navController.navigate("products/${categoria.id}")
        }
    ) {
        Column(modifier = Modifier.fillMaxWidth()
            .background(color = Color(0xFF00965A)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = categoria.name,
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold)

            Image(painter = painterResource(id = categoria.image),
                contentDescription = categoria.name,
                modifier = Modifier.size(250.dp)
            )
        }
    }
}