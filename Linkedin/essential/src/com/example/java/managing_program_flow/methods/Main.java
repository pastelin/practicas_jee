package com.example.java.managing_program_flow.methods;

public class Main {

    static String[] months = {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {

        loopIt("Months of year");
        loopIt("Second run");
        loopIt("Third run");

    }

    static void loopIt(String label) {
        System.out.println(label);

        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }

        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

    }

}
