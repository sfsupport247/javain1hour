package com.sfsupport247.trainings.java.javain1hour.section6;

// Vehicle.java
public class Vehicle {
    private String model;
    private double speed;
    protected static int numberOfVehicles = 0; // static variable

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
        numberOfVehicles++;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate(double acceleration) {
        speed += acceleration;
        System.out.println(model + " accelerated to " + speed + " km/h.");
    }

    // Method overriding
    public void start() {
        System.out.println("Vehicle started.");
    }

    // Method overloading
    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Static method
    public static void displayNumberOfVehicles() {
        System.out.println("Number of vehicles created: " + numberOfVehicles);
    }
}
