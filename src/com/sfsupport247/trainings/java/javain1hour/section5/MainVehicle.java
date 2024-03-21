package com.sfsupport247.trainings.java.javain1hour.section5;

public class MainVehicle {
    public static void main(String[] args) {
        // Creating objects
        Vehicle myCar = new Vehicle();
        myCar.type = "Car";
        myCar.color = "Red";
        myCar.year = 2024;

        // Accessing object's methods
        myCar.start();
        myCar.stop();
    }
}
