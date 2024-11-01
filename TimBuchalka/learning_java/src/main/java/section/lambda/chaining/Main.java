package section.lambda.chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        String name = "Juan";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Pastelin");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Pastelin"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Pastelin"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name));

        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Pastelin"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println(f2.apply(name));

        String[] names  = {"Ann", "Bob", "Carol"};
        Consumer<String> s0 = s -> System.out.println(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.println(" - "))
                .andThen(s1)
        );

        Predicate<String> p1 = s -> s.equals("JUAN");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Juan");
        Predicate<String> p3 = s -> s.startsWith("P");
        Predicate<String> p4 = s -> s.endsWith("e");

        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined = " + combined1.test(name));

        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name));

        Predicate<String> combined3 = p3.and(p4).negate();
        System.out.println("combined3 = " + combined2.test(name));

        record Person(String firstName, String lastName) {}
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("Peter", "PumpkinEater"),
                new Person("Minnie", "Mouse"),
                new Person("Mickey", "Mouse")
        ));

        // Ejemplo 01 ordenando una lista
        list.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        list.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        // Ejemplo 02 ordenando una lista usando comparing
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        // Ejemplo 03 ordenando una lista usando comparing multi nivel
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName));
        list.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        // Ejemplo 04 ordenando una lista usando comparing() multi nivel con reverse()
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName)
                .reversed());
        list.forEach(System.out::println);

    }

}
