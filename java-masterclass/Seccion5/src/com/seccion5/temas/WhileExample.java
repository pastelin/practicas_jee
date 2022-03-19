package com.seccion5.temas;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is = " + count);
            count++;
        }

        for(count = 1; count != 6; count++) {
            System.out.println("Count value is = " + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is = " + count);
            count++;
        }

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int contador = 0;
        int sum = 0;

        while(number <= finishNumber) {
            number++;

            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number: " + number);
            contador++;
            sum += number;

            if(contador == 5) {
                System.out.println("The total of the even number is: " + sum);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }

}
