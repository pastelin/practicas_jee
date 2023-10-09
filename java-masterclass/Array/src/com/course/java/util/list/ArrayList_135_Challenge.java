package com.course.java.util.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayList_135_Challenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            System.out.println(printActions());

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));

        for(String item : items) {
            String trimmed = item.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(String item : items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    private static String printActions() {
        StringBuilder sb = new StringBuilder();

        sb.append("Available actions \n");
        sb.append("0 - to shutdown \n");
        sb.append("1 - to add item(s) to list (comma delimited list) \n");
        sb.append("2 - to remove any items (comma delimited list) \n");
        sb.append("Enter a number for which action you want to do: ");

        return sb.toString();
    }

}
