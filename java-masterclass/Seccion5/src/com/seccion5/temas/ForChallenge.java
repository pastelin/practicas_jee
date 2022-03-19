package com.seccion5.temas;

public class ForChallenge {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        INNER_LOOP: for(int i = 1; i <= 1000; i++) {
            if( i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("Found Number = " + i);
            }

            if(count == 5) {
                System.out.println("La suma total es: " + sum);
                break INNER_LOOP;
            }
        }
    }

}
