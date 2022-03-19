/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.
* */

package com.seccion5.retos;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimumNumber = Integer.MIN_VALUE;
        int maximumNumber = 0;
        int number = 0;

        while(true) {
            System.out.println("Enter number");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                number = scanner.nextInt();

                maximumNumber = (number > maximumNumber) ? number : maximumNumber;
                minimumNumber = (number < minimumNumber) ? number : minimumNumber;

            } else {
                System.out.println("Minimun number: " + minimumNumber);
                System.out.println("Maximun number: " + maximumNumber);
                break;
            }
        }

        scanner.close();
    }

}
