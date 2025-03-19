package com.example.challenge.data.common

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

sealed class Resource<out D : Any> {
    data class Success<out D : Any>(val data: D) : Resource<D>()
    data class Error<out D : Any>(val errorMessage: String) : Resource<D>()
    data class Loading<Nothing : Any>(val loading: Boolean) : Resource<Nothing>()
}
