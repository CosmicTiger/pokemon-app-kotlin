package com.atclabs.pokedexjetpackcompose.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.plcoding.jetpackcomposepokedex.data.remote.responses.TypeX

data class Type(
    val slot: Int,
    val type: TypeX
)