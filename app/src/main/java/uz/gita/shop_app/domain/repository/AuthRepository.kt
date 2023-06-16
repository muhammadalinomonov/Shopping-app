package uz.gita.shop_app.domain.repository

import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun login(email: String, password: String): Flow<Result<Unit>>
    fun createUser(email: String, password: String): Flow<Result<Unit>>
}