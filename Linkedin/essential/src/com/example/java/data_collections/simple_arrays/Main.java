package com.example.java.data_collections.simple_arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9,6,3};
        Arrays.sort(ints);

        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }

        for (int i = 0; i < sized.length; i++) {
            System.out.println(sized[i]);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied) {
            System.out.println(value);
        }
    }

}
