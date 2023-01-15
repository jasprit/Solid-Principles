package com.example.solidprinciple


/**
 * Liskov Substitution Principle
 * the child class must be substitutable for the parent class.
 * We should be able to use child classes instead of, parent class
 */


interface Vehicle {
    fun moveForward()
    fun moveBackward()
}

abstract class VehicleWithEngine : Vehicle {
    private var isEngineWorking = false
    open fun startEngine() {
        isEngineWorking = true
    }

    open fun stopEngine() {
        isEngineWorking = false
    }
}

class Car : VehicleWithEngine() {
    override fun startEngine() {
        super.startEngine()
        print("engine started")
    }

    override fun stopEngine() {
        super.stopEngine()
        print("engine stopped")
    }

    override fun moveForward() {
        print("moving forward")
    }

    override fun moveBackward() {
        print("moving backward")
    }
}

class ByCycle : Vehicle {
    override fun moveForward() {
        print("moving forward")
    }

    override fun moveBackward() {
        print("moving backward")
    }

}