package com.example.swapitest.pages.people

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.swapitest.models.PeopleResult
import com.example.swapitest.networking.Resource
import com.example.swapitest.networking.repo.PeopleUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class PeopleViewModel constructor(private val peopleUseCase: PeopleUseCase) : ViewModel() {
    private val _state = mutableStateOf(PeopleState())
    val state: State<PeopleState> = _state
    lateinit var peopleDetail: PeopleResult;

    init {
        getPeople()
    }

    private fun getPeople() {
        val res = peopleUseCase.invoke(1)
        res.onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    _state.value = PeopleState(isLoading = true)
                }

                is Resource.Success -> {
                    _state.value = PeopleState(data = result.data)
                }

                is Resource.Error -> {
                    _state.value = PeopleState(error = result.message ?: "error getting data")
                }
            }
        }.launchIn(viewModelScope)
    }
}