package com.example.solidprinciple


/**
 * Interface Segregation Principle
 * classes should not be forced to use methods if they don't need that methods
 * We can avoid this by adding body to the interface methods
 */

interface NewVehicle {
    fun moveForward()
    fun moveBackward()
    fun startEngine() {} // by adding body to function, child class don't need this
}

class Cycle : NewVehicle {
    override fun moveForward() {
        print("moving forward")
    }

    override fun moveBackward() {
        print("moving backward")
    }
}