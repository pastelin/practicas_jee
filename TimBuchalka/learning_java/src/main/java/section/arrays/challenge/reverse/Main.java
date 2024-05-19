package section.arrays.challenge.reverse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1,2,3,4})));
    }

    private static int[] reverse (int[] array) {

        System.out.println("Initial Array: ");
        System.out.println(Arrays.toString(array));
        int fin = array.length - 1;

        int media = array.length / 2;

        for (int i = 0; i < media; i++) {
            int temp = array[i];
            array[i] = array[fin - i];
            array[fin - i] = temp;
        }

        return array;
    }

}
