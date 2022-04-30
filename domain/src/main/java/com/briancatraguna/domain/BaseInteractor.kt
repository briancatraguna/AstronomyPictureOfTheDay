package com.briancatraguna.domain

import kotlinx.coroutines.flow.Flow

interface BaseInteractor<T> {

    suspend operator fun invoke(): Flow<T>

}