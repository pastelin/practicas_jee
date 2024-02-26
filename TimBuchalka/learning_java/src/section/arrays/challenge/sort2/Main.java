package com.course.java.util.arrays.challenge.sort2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[size];

        for(int i = 0; i < size; i++) {
            integers[i] = scanner.nextInt();
        }

        return integers;
    }

    public static void printArray(int[] integers) {

        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element " + i + " contents " + integers[i]);
        }

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("------> " + Arrays.toString(sortedArray));
                }
            }

            System.out.println("--> " + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }

}
