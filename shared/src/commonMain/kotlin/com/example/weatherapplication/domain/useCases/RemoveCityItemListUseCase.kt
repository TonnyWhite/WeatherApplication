package com.example.weatherapplication.domain.useCases

import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseIn
import kotlinx.coroutines.flow.Flow

class RemoveCityItemListUseCase(private val repository: CityRepository): UseCaseIn<Int> {
    override fun execute(param: Int): Flow<Unit> = repository.removeCityItem(param)
}