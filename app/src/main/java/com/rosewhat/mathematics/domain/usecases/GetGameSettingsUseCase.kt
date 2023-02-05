package com.rosewhat.mathematics.domain.usecases

import com.rosewhat.mathematics.domain.entity.GameSettings
import com.rosewhat.mathematics.domain.entity.Level
import com.rosewhat.mathematics.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level = level)
    }
}