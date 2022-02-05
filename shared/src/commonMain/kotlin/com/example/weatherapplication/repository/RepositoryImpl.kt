package com.example.weatherapplication.repository

import com.example.weatherapplication.domain.useCases.CityItem
import com.example.weatherapplication.domain.useCases.CityRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl(
    private val savedData: SavedData,
    private val requestData: RequestData
    ) : CityRepository {
    override fun getCityItemList(): Flow<List<CityItem>> = flow {
        emit(savedData.getSavedCities())
    }

    override fun getSavedCitiesItem(): Flow<List<CityItem>> = flow {
       emit(savedData.getSavedCities())
    }

    override fun removeCityItem(id: Int): Flow<Unit> = flow{
        emit(savedData.removeCityItem(id))
    }

    override fun saveCityItem(cityItem: CityItem): Flow<Unit> = flow {
        emit(savedData.saveCityItem(cityItem))
    }

    override fun getCityItem(name: String): Flow<CityItem> = flow {
//        emit(requestData.getCityItemFromApi(name))
        requestData.getCityItemFromApi(name)
    }

}


