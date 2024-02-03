package com.example.java.exception_handling_and_debugging.try_catch;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            System.out.println("Last character: " + lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

    }

}
