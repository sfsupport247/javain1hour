package com.sfsupport247.trainings.java.javain1hour.section6;

// FlyingCar.java
public class FlyingCar extends Vehicle {
    private double altitude;
    private String engineType;

    public FlyingCar(String model, String engineType) {
        super(model);
        this.altitude = 0;
        this.engineType = engineType;
    }

    // Method overriding
    @Override
    public void start() {
        System.out.println("Flying car started.");
    }
}
