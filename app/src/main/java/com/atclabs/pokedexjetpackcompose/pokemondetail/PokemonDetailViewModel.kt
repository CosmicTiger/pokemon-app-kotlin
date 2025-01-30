package com.atclabs.pokedexjetpackcompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.atclabs.pokedexjetpackcompose.data.remote.responses.Pokemon
import com.atclabs.pokedexjetpackcompose.repository.PokemonRepository
import com.atclabs.pokedexjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}