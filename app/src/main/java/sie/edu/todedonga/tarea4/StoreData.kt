package sie.edu.todedonga.tarea4

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class StoreData(private val context: Context) {
    companion object {
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

        val AGE = intPreferencesKey("edad")
        val NAME = stringPreferencesKey("nombre")
        val HEIGHT = stringPreferencesKey("altura")
        val CASH = stringPreferencesKey("dinero_en_monedero")
    }

    val age: Flow<Int> = context.dataStore.data.map { preferences -> preferences[AGE] ?: 0 }

    val name: Flow<String> = context.dataStore.data.map { preferences -> preferences[NAME] ?: "" }

    val height: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[HEIGHT]?.toFloatOrNull() ?: 0f
    }

    val cash: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[CASH]?.toFloatOrNull() ?: 0f
    }

    suspend fun savePersonData(
        personName: String,
        personAge: Int,
        personHeight: Float,
        personCash: Float
    ) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
            settings[NAME] = personName
            settings[HEIGHT] = personHeight.toString()
            settings[CASH] = personCash.toString()
        }
    }
}