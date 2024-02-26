package com.example.java.working_with_objects.comparing_strings;

public class Main {

    public static void main(String[] args) {

        // Antes de crear un nuevo objeto el compilador busca la literal en la tabla de cadenas existentes
        // y si existe alguna coincidencia en lugar de crear el nuevo objeto este simplemente apunta a la referencia existente.
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match");
        }

        // La comparacion nunca distingue entre mayusculas y minusculas
        String str3 = "hello";

        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";

        if (str4.equals(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match");
        }



    }

}
