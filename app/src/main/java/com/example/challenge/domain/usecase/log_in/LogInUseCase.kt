package com.example.challenge.domain.usecase.log_in

import com.example.challenge.data.common.Resource
import com.example.challenge.domain.repository.log_in.LogInRepository
import com.example.challenge.domain.usecase.datastore.SaveTokenUseCase
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LogInUseCase @Inject constructor(
    private val saveTokenUseCase: SaveTokenUseCase,
    private val logInRepository: LogInRepository
) {
    suspend operator fun invoke(email: String, password: String) =
        logInRepository.logIn(email = email, password = password).map { result ->
            if (result is Resource.Success) {
                saveTokenUseCase(result.data.accessToken)
            }

            result
        }
}