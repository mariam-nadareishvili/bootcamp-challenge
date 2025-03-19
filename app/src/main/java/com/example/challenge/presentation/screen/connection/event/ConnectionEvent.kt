package com.example.challenge.presentation.screen.connection.event

sealed class ConnectionEvent {
    data object FetchConnections : ConnectionEvent()
    data object LogOut : ConnectionEvent()
    data object ResetErrorMessage : ConnectionEvent()
}