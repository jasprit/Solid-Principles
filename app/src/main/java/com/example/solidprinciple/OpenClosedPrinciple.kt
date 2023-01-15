package com.example.solidprinciple


/**
 * Open-Closed Principle
 * Class should be open for Extension(Adding features)
 * but, Closed for modification
 */

// Example one using Inheritance
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

// Example two using Interface
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

