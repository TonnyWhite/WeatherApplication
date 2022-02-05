package com.example.weatherapplication.presentation.mvi

sealed class BasicUIState<out T> {
    data class Success<T>(val data: T) : BasicUIState<T>()
    data class Error(val message: String? = null) : BasicUIState<Nothing>()
    object Loading : BasicUIState<Nothing>()
    object Empty : BasicUIState<Nothing>()
    object Idle : BasicUIState<Nothing>()
}