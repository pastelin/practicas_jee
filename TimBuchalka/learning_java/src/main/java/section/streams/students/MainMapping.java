package section.streams.students;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class MainMapping {

    public static void main(String[] args) {
        Course pymc = new Course("PYMC", "Python Masterclass", 50);
        Course jmc = new Course("JMC", "Java Master Class", 100);
        Course jgames = new Course("JGAME", "Creating games in Java");

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStuden(pymc, jmc))
                .toList();

        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));

        mappedStudents.forEach((k, v) -> System.out.println(k + " " + v.size()));

        System.out.println("---------------------------------------------------");

        int minAge = 25;
        var youngerSet = students.stream()
                .collect(groupingBy(Student::getCountryCode,
                        filtering(s -> s.getAge() <= minAge, toList())));

        youngerSet.forEach((k, v) -> System.out.println(k + " " + v.size()));

        var experienced = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience));
        System.out.println("Experienced Students = " + experienced.get(true).size());

        var expCount = students.stream()
                .collect(partitioningBy(Student::hasProgrammingExperience, counting()));
        System.out.println("Experienced Students = " +  expCount.get(true));

        var experiencedAndActive = students.stream()
                .collect(partitioningBy(
                        s -> s.hasProgrammingExperience()
                            && s.getMonthsSinceActive() == 0,
                        counting()));
        System.out.println("Experinced and Activate Students = " + experiencedAndActive.get(true));

        // genea un mapa por pais, y dentro de este crea otro mapa por sexo
        var multiLevel = students.stream()
                .collect(groupingBy(Student::getCountryCode,
                        groupingBy(Student::getGender)));

        multiLevel.forEach((key, value) -> {
            System.out.println(key);
            value.forEach((key1, value1) -> {
                System.out.println("\t" + key1 + " " + value1.size());
            });
        });

        long studentBodyCount = 0;
        for (var list : experienced.values()) {
            studentBodyCount += list.size();
        }
        System.out.println("studenBodyCount = " + studentBodyCount);

        studentBodyCount = experienced.values().stream()
                .mapToInt(List::size)
                .sum();
        System.out.println("studenBodyCount = " + studentBodyCount);

        studentBodyCount = experienced.values().stream()
                .mapToInt(List::size)
                .sum();
        System.out.println("studenBodyCount = " + studentBodyCount);

        // Ejemplo dificil de leer y entender
        studentBodyCount = experienced.values().stream()
                .map(l -> l.stream()
                        .filter(s -> s.getMonthsSinceActive() <= 3)
                        .count()
                )
                .mapToLong(l -> l)
                .sum();
        System.out.println("studenBodyCount = " + studentBodyCount);

        /**
         * FlatMap nos permive utilizar un unico flujo de tuberia en lugar de anidarlas
         */

        long count = experienced.values().stream()
                .flatMap(l -> l.stream())
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active Studens = " + count);

        // Primer ejemplo con maps anidados
        count = multiLevel.values().stream()
                .flatMap(map -> map.values().stream()
                        .flatMap(l -> l.stream())
                )
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();

        // Primer ejemplo con maps anidados
        count = multiLevel.values().stream()
                .flatMap(map -> map.values().stream())
                .flatMap(l -> l.stream())
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();

    }

}
