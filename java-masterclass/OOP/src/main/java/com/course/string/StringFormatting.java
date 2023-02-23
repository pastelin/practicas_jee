package com.course.string;

import java.time.LocalDate;

public class StringFormatting {

    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        // Se usa las comillas 3 veces en apertura y cierre para que el formato especificado dentro de las comillas
        // se imprima tal cual como se define, donde no es necesario usar la concatenacion, tabulaciones y saltos de
        // linea como en el ejemplo anterior.
        String textBlock = """
                Print a Bullet List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 25;
        // %d indica que es de tipo integer
        System.out.printf("Your age is %d", age);

        int currentYear = LocalDate.now().getYear();
        int exactYear = currentYear - 1997;
        int yearOfBirth = currentYear - exactYear;

        // %n : indica un salto de linea
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        // %.2f : indica que sera de tipo float con 2 decimales
        System.out.printf("Your age is %.2f%n", (float) age);

        // %6d : indica en la posicion qen la que inicia y se ira recorriendo como lo vaya requiriendo
        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        // This method was included in JDK 15
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }

}
