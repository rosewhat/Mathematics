package com.rosewhat.mathematics.domain.usecases

import com.rosewhat.mathematics.domain.entity.Question
import com.rosewhat.mathematics.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestionUseCase(maxSumValue, COUNT_OF_OPTIONS)
    }

    companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}