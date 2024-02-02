package com.course.string;

public class AllAboutStrings {

    public static void main(String[] args) {
        printInformations("Hello World");
        printInformations("");
        printInformations("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
    }

     public static void printInformations(String string) {
        int length = string.length();
         System.out.printf("Length = %d %n", length);

         if(string.isEmpty()) {
             System.out.println("String is empty");
             return;
         }

         if(string.isBlank()) {
             System.out.println("String is Blank");
         }

         // %c : indica que solo imprimira un caracter
         System.out.printf("First char = %c %n", string.charAt(0));

         System.out.printf("Last char = %c %n", string.charAt(length - 1));
     }

}