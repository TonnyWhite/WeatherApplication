package com.example.weatherapplication.domain.useCases

import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseInOut
import kotlinx.coroutines.flow.Flow

class GetCityItemUseCase(private val repository: CityRepository):
    UseCaseInOut<Int, CityItem> {
    override fun execute(param: Int): Flow<CityItem> = repository.getCityItem(param)

}