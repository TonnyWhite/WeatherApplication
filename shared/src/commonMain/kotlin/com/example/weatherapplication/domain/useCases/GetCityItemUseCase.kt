package com.example.weatherapplication.domain.useCases

import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseInOut
import kotlinx.coroutines.flow.Flow

class GetCityItemUseCase(private val repository: CityRepository):
    UseCaseInOut<String, CityItem> {
    override fun execute(param: String): Flow<CityItem> = repository.getCityItem(param)

}