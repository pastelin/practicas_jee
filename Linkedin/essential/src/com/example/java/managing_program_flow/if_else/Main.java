package com.example.java.managing_program_flow.if_else;

public class Main {

    public static void main(String[] args) {

        int monthNumber = 8;

        // IF es una estructura condicional
        // Solo se ejecuta una sola vez y es cuando la condición es verdadera
        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("You're in Quarter 1");
        } else if (monthNumber >= 3 && monthNumber <= 6) {
            System.out.println("You're in Quarter 2");
        } else if (monthNumber >= 6 && monthNumber <= 9) {
            System.out.println("You're in Quarter 3");
        } else if (monthNumber >= 9 && monthNumber <= 12) {
            System.out.println("You're in Quarter 4");
        } else {
            System.out.println("That's an unknown month!");
        }

    }

}
