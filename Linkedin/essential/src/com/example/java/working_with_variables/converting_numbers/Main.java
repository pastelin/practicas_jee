package com.example.java.working_with_variables.converting_numbers;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("intValue2 = " + intValue2);

        // Ampliacion de tipo
        long longValue1 = intValue1;
        System.out.println("longValue1 = " + longValue1);

        // Estrechar tipo
        short shortValue1 = (short) intValue1;
        System.out.println("shortValue1 = " + shortValue1);

        // Perdida de datos
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("byteValue = " + byteValue);
        


    }

}
