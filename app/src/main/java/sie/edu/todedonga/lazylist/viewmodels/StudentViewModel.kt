package sie.edu.todedonga.lazylist.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import sie.edu.todedonga.lazylist.models.WinnerModel

class StudentViewModel : ViewModel() {

    var selectedStudent by mutableStateOf("")
        private set

    var isLoading  by mutableStateOf(false)
        private set

    var contador by mutableIntStateOf(0)
        private set

    var winner by mutableStateOf(
        WinnerModel(name = "", number = 0)
    )
        private set
    init {

    }

    //function sincroma
    fun onClickLuckyButton() {
        viewModelScope.launch {
            selectedStudent = getStudentsAsync()
            //winner.name = selectedStudent
            winner = winner.copy(name = selectedStudent)
        }
    }

    suspend fun getStudents() : String {
        return withContext(Dispatchers.IO) {
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Ivan",
                "Yuanel", "Eunice", "Julia", "Maximiliano",
                "Juan Pablo", "Zuri", "Roberto", "Gerardo",
                "Luis Alberto", "David", "Alain", "Valeria",
                "Edna", "Guillermo"
            )
            students.random()
        }
    }

    suspend fun getStudentsAsync() : String {
        return withContext(Dispatchers.IO) {
            isLoading = true
            contador ++
            winner.number = contador
            selectedStudent = ""
            delay(5000)
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Ivan",
                "Yuanel", "Eunice", "Julia", "Maximiliano",
                "Juan Pablo", "Zuri", "Roberto", "Gerardo",
                "Luis Alberto", "David", "Alain", "Valeria",
                "Edna", "Guillermo"
            )
            delay(3000)
            isLoading = false
            students.random()
        }
    }
}