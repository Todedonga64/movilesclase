package sie.edu.todedonga.tarea3

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Tarea3View(id: Int, nombre: String) {

    if(id >= 1 && id <= 10) {
        Text(text = "Bienvenido al Laboratorio de ISND estimado Coordinador " + nombre)
    } else if (id >= 11 && id <= 100) {
        Text(text = "Permiso autorizado para el profesor " + nombre)
    } else if (id >= 101 && id <= 19000) {
        Text(text = "Acceso denegado a egresados que no son de sistemas.")
    } else if (id >= 19001 && id <= 22210 && id != 22180) {
        Text(text = "Bievenido " + nombre + ", es un gusto verlo por aquí.")
    } else if (id == 22180) {
        Text(text = "Alumno en intercambio no es posible esté presente en el I.E.ST")
    } else if (id == 19327 || id == 19584 || id == 20059 || id == 20104 || id == 20291
            || id == 20374 || id == 20715 || id == 22436 || id == 22498 || id == 22515
            || id == 22620 || id == 22627 || id == 22751 || id == 22757 || id == 22769
            || id == 22789 || id == 22866 || id == 22969)
    {
        Text(text = "Alumno " + nombre + " autorizado para uso del laboratorio.")
    } else {
        Text(text = "Este laboratorio es de uso exclusivo para la carrera ISND")
    }
}