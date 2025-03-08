package sie.edu.todedonga.lazylist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.todedonga.lazylist.views.ProductView

@Preview(showBackground = true)
@Composable
fun ListasView() {
    Column(modifier = Modifier.fillMaxSize()) {

        LazyRow() {

            item {
                Button(onClick = { }) {
                    Text(text = "Terminar compra")
                }
            }

        }
    }
}