package uz.gita.shop_app.domain.repository.impl

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import uz.gita.shop_app.domain.repository.AuthRepository
import javax.inject.Inject

var user: FirebaseUser? = null


class AuthRepositoryImpl @Inject constructor() : AuthRepository {
    private val auth: FirebaseAuth = Firebase.auth

    override fun login(email: String, password: String): Flow<Result<Unit>> = callbackFlow {
        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                user = auth.currentUser
                trySend(Result.success(Unit))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
            .addOnCanceledListener {
                trySend(Result.failure(Exception("Cancelled operation")))
            }

        awaitClose()
    }

    override fun createUser(email: String, password: String): Flow<Result<Unit>> = callbackFlow {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                user = auth.currentUser
                trySend(Result.success(Unit))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }

        awaitClose()
    }
}