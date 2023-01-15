package com.example.solidprinciple


/**
 * SingleResponsibility Principle
 * Each class has one and only one responsibility..
 * AuthenticationService class only responsible for
 * signIn and signOut
 */

data class User(var email: String, var password: String)

class AuthenticationService() {

    fun signIn() {}
    fun signOut() {}
}
