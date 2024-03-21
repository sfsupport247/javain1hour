package com.sfsupport247.trainings.java.javain1hour.section6;

// Car.java
public class Car extends Vehicle {
    private int numberOfSeats;
    private String fuelType;

    public Car(String model, int numberOfSeats, String fuelType) {
        super(model);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    // Method overriding
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    // Method overloading
    public void stop(boolean isEmergencyStop) {
        if (isEmergencyStop) {
            System.out.println("Emergency stop!");
        } else {
            stop(); // Calling the overloaded method
        }
    }
}
