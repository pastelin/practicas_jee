package com.example.java.managing_program_flow.statement_switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);

        // Es una estructura de control condicional, que permite definir múltiples casos que puede llegar a cumplir una variable cualquiera.
        switch (monthNumber) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            default:
                System.out.println("You chose another month!");
        }
    }

}
