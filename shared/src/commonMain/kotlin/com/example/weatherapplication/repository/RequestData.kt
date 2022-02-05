package com.example.weatherapplication.repository

import com.example.weatherapplication.api.model.ApiWeather

interface RequestData {
    suspend fun getCityItemFromApi(name: String):ApiWeather
}