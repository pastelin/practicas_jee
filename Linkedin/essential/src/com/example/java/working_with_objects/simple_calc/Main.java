package com.example.java.working_with_objects.simple_calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric Value: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter a numeric Value: ");
        double number2 = scanner.nextDouble();

        System.out.println("The answer is " + (number1 + number2));

    }
}
