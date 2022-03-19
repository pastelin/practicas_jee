package com.seccion5.temas;

public class ForExample {
    public static void main(String[] args) {
        for(int i = 2; i <= 8; i++) {
            //System.out.println(calculateInterest(10000, i));
        }

        System.out.println("******");

        for(int i = 8; i >= 2; i--) {
            //System.out.println(calculateInterest(10000, i));
        }

        System.out.println("***********");
        int count = 0;
        for(int i = 1; i < 20; i++) {
            if(isPrime(i)) {
                System.out.println(i + " es un numero primo");
                count++;
            }
            if(count == 3) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



}
