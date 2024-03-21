package com.sfsupport247.trainings.java.javain1hour.section6;

// Main.java
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", 5, "Petrol");
        Vehicle flyingCar = new FlyingCar("Sky Cruiser", "Electric");

        car.start(); // Polymorphism
        flyingCar.start(); // Polymorphism

        car.stop(); // Method overloading
        ((Car) car).stop(true); // Method overloading with casting

        Vehicle.displayNumberOfVehicles(); // Static method
    }
}