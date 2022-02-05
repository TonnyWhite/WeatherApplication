package com.example.weatherapplication.api.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiWeather(
    val id: Long,
    val name: String,
    val main: Main
)

@Serializable
data class Main(
    val temp: Double,
    val feels_ike: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Long,
    val humidity: Long
)