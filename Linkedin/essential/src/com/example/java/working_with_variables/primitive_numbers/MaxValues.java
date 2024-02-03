package com.example.java.working_with_variables.primitive_numbers;

public class MaxValues {

    public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte " + b);

        if(b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte: " + b);

    }

}
