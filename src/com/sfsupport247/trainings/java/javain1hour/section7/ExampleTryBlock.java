package com.sfsupport247.trainings.java.javain1hour.section7;

public class ExampleTryBlock {

    public static void main(String a[]) {
        try {
            int result = 10/0;            
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by 0 - Please fix.");
        }
    }
}