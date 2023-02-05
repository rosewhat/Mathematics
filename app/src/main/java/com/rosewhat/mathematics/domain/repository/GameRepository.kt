package com.rosewhat.mathematics.domain.repository

import com.rosewhat.mathematics.domain.entity.GameSettings
import com.rosewhat.mathematics.domain.entity.Level
import com.rosewhat.mathematics.domain.entity.Question

interface GameRepository {
    fun getGameSettings(level: Level): GameSettings
    fun generateQuestionUseCase(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
}