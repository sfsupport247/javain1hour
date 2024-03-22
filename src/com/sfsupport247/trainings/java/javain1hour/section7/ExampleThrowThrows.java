package com.sfsupport247.trainings.java.javain1hour.section7;

public class ExampleThrowThrows {
    public static void main(String[] args) {
        try {
            // Call the divide method
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: Can't divide by 0 - Please fix.");
        } finally {
            System.out.println("This block will always execute.");
        }
    }

    // Adding 'throws' in the method signature for demonstration
    public static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            // Explicitly throwing an exception using 'throw'
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + numerator / denominator);
        }
    }
}