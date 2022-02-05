package com.example.weatherapplication.domain.useCases

import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseOut
import kotlinx.coroutines.flow.Flow

class GetCityItemListUseCase(private val repository: CityRepository): UseCaseOut<List<CityItem>> {
    override fun execute(): Flow<List<CityItem>> = repository.getCityItemList()
}