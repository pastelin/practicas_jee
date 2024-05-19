package section.lambda.mini_challenges;

import java.util.Arrays;
import java.util.function.Consumer;

public class MiniChallenge1 {

    public static void main(String[] args) {

        // Ejemplo sin el uso de lamba
        Consumer<String> printWords = new Consumer<>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for(String part : parts) {
                    System.out.println(part);
                }
            }
        };

        // Ejemplo utilizando lamba
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");

        // Ejemplo utilizando lamba y forEach mejorado
        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach( s -> System.out.println(s));
        };
        printWordsForEach.accept("Let's split this up into an array");

        // Ejemplo utilizando lamba y forEach mejorado en una sola línea
        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach( s -> System.out.println(s));
        };
        printWordsConcise.accept("Let's split this up into an array");

    }



}
