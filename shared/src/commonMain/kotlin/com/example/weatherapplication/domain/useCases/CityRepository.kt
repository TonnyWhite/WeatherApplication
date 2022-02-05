package com.example.weatherapplication.domain.useCases

import kotlinx.coroutines.flow.Flow

interface CityRepository {
    fun getCityItemList(): Flow<List<CityItem>>
    fun getSavedCitiesItem(): Flow<List<CityItem>>
    fun removeCityItem(idCharacter: Int): Flow<Unit>
    fun saveCityItem(cityItem: CityItem): Flow<Unit>
    fun getCityItem(id: Int): Flow<CityItem>
}