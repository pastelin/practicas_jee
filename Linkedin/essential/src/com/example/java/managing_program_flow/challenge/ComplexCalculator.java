package com.example.java.managing_program_flow.challenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.print("Enter a numeric value: ");
            String value1 = scanner.nextLine();

            System.out.print("Enter a numeric value: ");
            String value2 = scanner.nextLine();

            System.out.print("Choose an operation: ");
            String operation = scanner.nextLine();

            double value1Format = Double.parseDouble(value1);
            double value2Format = Double.parseDouble(value2);

            double result = 0;
            switch (operation) {
                case "+":
                    result = value1Format + value2Format;
                    break;
                case "-":
                    result = value1Format - value2Format;
                    break;
                case "*":
                    result = value1Format * value2Format;
                    break;
                case "/":
                    result = value1Format / value2Format;
                    break;
                default:
                    System.out.println("Unrecognized operation!");
            }

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }


    }


}
