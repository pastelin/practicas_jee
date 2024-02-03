package com.example.java.working_with_objects.format_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;

        Locale locale = new Locale("da", "DK");

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));

    }

}
