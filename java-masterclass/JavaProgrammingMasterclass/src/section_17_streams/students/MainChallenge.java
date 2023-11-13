package section_17_streams.students;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MainChallenge {

    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python Masterclass", 50);
        Course jmc = new Course("JMC", "Java Master Class", 100);
        Course jgames = new Course("JGAME", "Creating games in Java");

        // Crea una lista con 5000 estudiantes
        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStuden(jmc, pymc))
                .toList();

        // Obtiene la suma del porcentaje completado
        double totalPencent = students.stream()
                .mapToDouble(s -> s.getPercentComplete("JMC"))
                .reduce(0, Double::sum); // Se puede reemplazar esta linea usando .sum()

        double avePercent = totalPencent / students.size();
        System.out.printf("Average Percentage Complete = %.2f%% %n", avePercent);

        int topPercent = (int) (1.25 * avePercent);
        System.out.printf("Best Percentaage Complete = %d%% %n", topPercent);

        // Obtiene lista de ID de estudiantes con porcentaje mayor o igual al 80%
        Comparator<Student> longTermStudent = Comparator.comparing(Student::getYearEnrolled);

        List<Student> hardWorkers = students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
                .sorted(longTermStudent)
                .limit(10)
                .toList();

        hardWorkers.forEach(s -> {
            s.addCourse(jgames);
            System.out.print(s.getStudentId() + " ");
        });

        System.out.println();


        // Obtiene lista de ID de estudiantes con porcentaje mayor o igual al 80%
        Comparator<Student> uniqueSorted = longTermStudent.thenComparing(Student::getStudentId);

        students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= topPercent)
                .sorted(longTermStudent)
                .limit(10)
//                .toList()
//                .collect(Collectors.toList())
//                .collect(Collectors.toSet())
//                .collect(() -> new TreeSet<>(uniqueSorted),
//                        TreeSet::add, TreeSet::addAll)
                .forEach(s -> {
                    s.addCourse(jgames);
                    System.out.print(s.getStudentId() + " ");
                });
    }

}
