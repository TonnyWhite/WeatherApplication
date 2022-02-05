package com.example.weatherapplication.domain.useCases

import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseIn
import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseInOut
import daniel.avila.ricknmortykmm.shared.domain.interactors.type.UseCaseOut
import kotlinx.coroutines.flow.Flow

class SaveCityItemUseCase(val repository: CityRepository): UseCaseIn<CityItem> {
    override fun execute(param: CityItem): Flow<Unit> = repository.saveCityItem(param)
}