# Solid-Principles

# S - Single Responsibility
 
data class User(var email: String, var password: String)

class AuthenticationService() {

    fun signIn() {}
    fun signOut() {}
}
Each class has one and only one responsibility. AuthenticationService class only responsible for signIn and signOut

Reference source:- 
https://www.youtube.com/watch?v=t8VTLxMsufU

https://medium.com/the-android-caf%C3%A9/solid-principles-the-kotlin-way-ff717c0d60da

