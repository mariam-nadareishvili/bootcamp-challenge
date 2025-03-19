package com.example.challenge.presentation.screen.connection.state

import com.example.challenge.presentation.screen.connection.model.Connection

data class ConnectionState(
    val isLoading: Boolean = false,
    val connections: List<Connection>? = null,
    val errorMessage: String? = null
)