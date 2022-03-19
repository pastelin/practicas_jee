package temas;

/*

-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the
numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name MinElementChallenge


* */

import java.util.Scanner;

public class MinElementChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] values = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.println("Ingrese un valor para la posición #" + (i + 1));
            values[i] = scanner.nextInt();
        }
        System.out.println(values.length);
        return values;
    }

    public static int findMin(int[] values) {
        int minValue = Integer.MAX_VALUE;

        for(int value : values) {
            if(value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el número de valores para el arreglo");
        int count = scanner.nextInt();

        int[] values = readIntegers(count);

        int minValue = findMin(values);

        System.out.println("El valor mínimo es: " + minValue);
    }

}
