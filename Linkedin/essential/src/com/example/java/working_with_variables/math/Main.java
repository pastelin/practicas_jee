package com.example.java.working_with_variables.math;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Substraction: " + result1);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result1);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result1);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder: " + result1);

        double doubleValue = 3.9999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded = " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute = " + absValue);
    }

}
