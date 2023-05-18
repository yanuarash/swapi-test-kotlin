package com.example.swapitest.pages.people_prop.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.swapitest.networking.Resource
import com.example.swapitest.networking.repo.vehicles.VehicleUseCase
import com.example.swapitest.pages.people_prop.PeoplePropState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class VehicleViewModel constructor(private val vehicleUseCase: VehicleUseCase) : ViewModel() {
    private val _state = mutableStateOf(PeoplePropState())
    val state: State<PeoplePropState> = _state

    fun getFilm(list: List<String>) {
        val res = vehicleUseCase.invoke(list)
        res.onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    _state.value = PeoplePropState(isLoading = true)
                }

                is Resource.Success -> {
                    _state.value = PeoplePropState(data = result.data)
                }

                is Resource.Error -> {
                    _state.value = PeoplePropState(error = result.message ?: "error getting data")
                }
            }
        }.launchIn(viewModelScope)
    }
}