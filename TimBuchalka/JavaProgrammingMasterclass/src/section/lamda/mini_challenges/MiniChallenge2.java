package section.lamda.mini_challenges;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MiniChallenge2 {

    public static void main(String[] args) {

        // ---> Example with lambda expression
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));

        // ---> Example using a method that execute the UnaryOperator
        String result = everySecondChar(everySecondChar, "1234567890");

        System.out.println(result);
    }

    // Método original (Clasico)
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }

    // Example using UnaryOperator
    public static String everySecondChar(UnaryOperator<String> operator, String source) {
        return operator.apply(source);
    }

    // Example using Function
    public static String everySecondChar(Function<String, String> operator, String source) {
        return operator.apply(source);
    }
}
