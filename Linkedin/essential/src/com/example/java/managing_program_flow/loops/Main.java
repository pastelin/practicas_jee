package com.example.java.  managing_program_flow.loops;

public class Main {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

        // 01: Punto de partida
        // 02: Condicion, se ejecutara siempre y cuando sea verdadera
        // 03: Incremento
        /*
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        */

        /*
        for(String month : months) {
            System.out.println(month);
        }
        */

        /*
        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }
        */

        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }

}
