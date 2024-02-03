package com.example.java.exception_handling_and_debugging.errors_and_exception;

public class Main {

    public static void main(String[] args) {

        String s = null;
        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length - 1];
        System.out.println(lastChar);


    }

}
