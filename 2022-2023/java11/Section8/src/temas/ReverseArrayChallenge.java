package temas;

import java.util.Arrays;

/*
-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef
* */
public class ReverseArrayChallenge {

    public static void reverse(int[] values) {

        int maxIndex = values.length -1;
        int halfIndex = values.length / 2;

            for(int i = 0; i < halfIndex ; i++) {
                int temp = values[i];
                values[i] = values[maxIndex - i];
                values[maxIndex - i] = temp;
            }
    }

    public static void main(String[] args) {

        int[] values = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(values));

        reverse(values);

        System.out.println(Arrays.toString(values));

    }


}
