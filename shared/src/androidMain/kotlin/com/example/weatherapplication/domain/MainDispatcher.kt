package com.example.weatherapplication.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual class MainDispatcher {
    actual val dispatcher: CoroutineDispatcher = Dispatchers.Main
}