package com.example.challenge.presentation.screen.log_in.state

data class LogInState(
    val isLoading: Boolean = false,
    val accessToken: String? = null,
    val errorMessage: String? = null
)