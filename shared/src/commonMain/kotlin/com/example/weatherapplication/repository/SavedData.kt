package com.example.weatherapplication.repository

import com.example.weatherapplication.domain.useCases.CityItem

interface SavedData {
    fun getSavedCities():List<CityItem>
    fun saveCityItem(cityItem: CityItem)
    fun removeCityItem(id: Int)
}