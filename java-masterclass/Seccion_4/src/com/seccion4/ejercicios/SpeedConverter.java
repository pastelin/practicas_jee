package com.seccion4.ejercicios;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }

        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalida Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "Km/h = " + milesPerHour +
                    "mi/h");
        }
    }

    public static void main(String[] args) {
        long miles = toMilesPerHour(10.5);
        System.out.println("miles = " + miles);

        printConversion(10.5);
    }

}
