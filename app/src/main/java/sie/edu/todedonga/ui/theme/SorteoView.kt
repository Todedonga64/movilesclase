package sie.edu.todedonga.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.edu.todedonga.R
import sie.edu.todedonga.lazylist.viewmodels.StudentViewModel

@Composable
fun SorteoView(studentViewModel: StudentViewModel) {


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(R.string.welcome))

        Spacer(modifier = Modifier.height(8.dp))

        if(studentViewModel.isLoading) {
            CircularProgressIndicator()
        } else {
            Button(onClick = {
                studentViewModel.onClickLuckyButton()
            }) {
                Text(text = stringResource(R.string.start_message))
            }
        }

        //Text(text = stringResource(R.string.start_message))
        //Text(text = studentViewModel.selectedStudent)//aqui el ganador
        //Text(text = studentViewModel.contador.toString())//aqui el numero de intentos

        Text(text = "${studentViewModel.winner.name} -- ${studentViewModel.winner.number}")
    }
}