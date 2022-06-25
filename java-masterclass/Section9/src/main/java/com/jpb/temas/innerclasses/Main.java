package com.jpb.temas.innerclasses;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I´ve been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;

        while(!quit) {
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }

        }
    }

}
