package com.course.java.util.arrays.challenge.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }


    public static int[] getRandomArray(int length) {

        Random random = new Random();
        int[] newInt = new int[length];

        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(1000 );
        }

        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
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
