# Solid-Principles

# S - Single Responsibility
 * Each class has one and only one responsibility.
 * AuthenticationService class only responsible for signIn and signOut
 
data class User(var email: String, var password: String)

class AuthenticationService() {

    fun signIn() {}
    fun signOut() {}
}




# O - Open Closed Principle

 * Open-Closed Principle
 * Class should be open for Extension(Adding features)
 * but, Closed for modification


## Example one using Inheritance
open class Logger {
    open fun logErrors(err: String) {
        print("error found - $err")
    }
}

class CustomLogger : Logger() {
    override fun logErrors(err: String) {
        print("custom error found - $err")
    }
}

## Example two using Interface
interface Errors {
    fun printErrors()
}

class CustomErrors : Errors {
    override fun printErrors() {
        print("errors")
    }
}

class ApiErrors : Errors {
    override fun printErrors() {
        TODO("Not yet implemented")
    }
}

 



# Reference source:- 
https://www.youtube.com/watch?v=t8VTLxMsufU

https://medium.com/the-android-caf%C3%A9/solid-principles-the-kotlin-way-ff717c0d60da

