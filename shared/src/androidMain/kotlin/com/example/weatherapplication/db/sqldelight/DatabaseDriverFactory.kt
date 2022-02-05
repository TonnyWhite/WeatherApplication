package com.example.weatherapplication.db.sqldelight


import `package com`.example.weatherapplication.db.sqldelight.AppDatabase.Companion.Schema
import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory (private val context: Context){
    actual fun createDriver(): SqlDriver{
        return AndroidSqliteDriver(AppDatabase.Schema)
    }
}