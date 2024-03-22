package com.sfsupport247.trainings.java.javain1hour.section5;

public class MainFlyingVehicle {
    public static void main(String[] args) {
        FlyingVehicle plane = new FlyingVehicle();
        plane.name = "Boeing 747"; // Accessing public attribute
        // plane.altitude = 35000; // Compilation error: Cannot access protected attribute
        // plane.speed = 550; // Accessing default attribute
        // plane.manufacturer = "Boeing"; // Compilation error: Cannot access private attribute

        // plane.displayInfo(); // Accessing public method
    }
}
