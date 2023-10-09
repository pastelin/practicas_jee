package section_17_streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class BingoChallenge {

    static int counter = 0;

    public static void main(String[] args) {

        // ------------------------ Example 01 (infinite)--------------------------------
        int seed = 1;
        var streamB = Stream.iterate(seed, s -> s <=15, s -> s +1)
                .map(s -> "B" + s);

        // ------------------------ Example 02 (infinite) --------------------------------
        seed += 15;
        var streamI = Stream.iterate(seed, s -> s +1)
                .limit(15)
                .map(s -> "I" + s);

        // ------------------------ Example 03 --------------------------------
        seed += 15;
        int nSeed = seed;
        String[] oLabels = new String[15];
        Arrays.setAll(oLabels, i -> "N" + (nSeed + i));
        var streamN = Arrays.stream(oLabels);

        // ------------------------ Example 04 --------------------------------
        seed += 15;
        var streamG = Stream.of("G46","G47","G48","G49","G50","G51","G52","G53","G54","G55","G56","G57","G58","G59","G60");

        // ------------------------ Example 05 (infinite) --------------------------------
        seed += 15;
        int rSeed = seed;
        var streamO = Stream.generate(BingoChallenge::getCounter)
                .limit(15)
                .map(s -> "O" + (rSeed + s));

        var streamBI = Stream.concat(streamB, streamI);
        var streamNG = Stream.concat(streamN, streamG);
        var streamBING = Stream.concat(streamBI, streamNG);
        Stream.concat(streamBING, streamO)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------");

        Stream.generate(() -> new Random().nextInt(rSeed, rSeed + 15))
                .distinct()
                .limit(15)
                .map(s -> "O" +  s)
                .sorted()
                .forEach(System.out::println);

    }

    private static int getCounter() {
        return counter++;
    }

}
