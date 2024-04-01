package section.generics.references;

import section.generics.references.util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();

        for(int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        students.add(new LPAStudent());
//        printList(students);
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();

        for(int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
//        printList(lpaStudents);
        printMoreLists(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        // Listar estudiantes
        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreLists(matches);

        // Ejemplo llamanado a metodo estatico
        var student2021 = QueryList.getMatches(students, "YearStarted", "2021");
        printMoreLists(student2021);

    }


    // El comodin ? no permite realizar modificaciones en la lista.
    // <? extends Student> : Indica el limite superior es decir que soporta la clase Studen y subtipos de estudent
    public static void printMoreLists(List<? extends Student> students) {
        for(var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof  String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

    // ---------------- Inicio de codigo reemplazado por el metodo testList -------------------------
//    public static void testList(List<String> list) {
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//        for (var element : list) {
//            System.out.println("Integer: " + element.toUpperCase());
//        }
//    }

    // ---------------- Fin de codigo reemplazado por el metodo testList -------------------------

//    public static <T extends Student> void printList(List<T> students) {
//        for(var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}
