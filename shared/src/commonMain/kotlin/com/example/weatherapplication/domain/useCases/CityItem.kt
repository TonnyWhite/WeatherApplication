package com.example.weatherapplication.domain.useCases

data class CityItem(
    val id: Int,
    val name: String,
    val maxDegree: Double,
    val minDegree: Double
)
