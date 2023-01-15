package com.example.solidprinciple


/**
 * Dependency Inversion Principle
 * We should depend on abstraction, not on concrete implementation
 * or, High level module should not depend upon the low level module.
 */

interface Authenticator {
    fun signInWithEmail(email: String, password: String)
}

class CustomAuthenticator : Authenticator {
    override fun signInWithEmail(email: String, password: String) {
        TODO("implement your api calls here..")
    }
}

class FirebaseAuthentication : Authenticator {
    override fun signInWithEmail(email: String, password: String) {
        TODO("implement your firebase calls here")
    }
}