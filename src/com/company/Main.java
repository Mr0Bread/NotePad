package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter command, please:");

            String cmd = scanner.next();
            switch (cmd) { // Command switch

                case "exit":   // Command to exit Main
                    System.out.println("Farewell!");
                    return;

                case "help": // Command to print text
                    String line = showHelp("Hello World");
                    System.out.println(line);
                    break;

                case "create":
                    create();
                    break;

                case "show":
                    show();
                    break;

                default:
                    System.out.println("No such command in program!");

            }
        }
    }

    private static void show() {
        System.out.println("Choose type:");
        String type = scanner.next();

        switch (type) {
            case "person":
                System.out.println("One or all of them?");
                String choose = scanner.next();
                System.out.println("\n");
                switch (choose) {
                    case "one" :
                        System.out.println("Enter persons ID:");
                        int id = scanner.nextInt();

                        Person.showPersonOne(id);
                        break;

                    case "all" :
                        Person.showPersonAll();
                        break;
                } break;


            default:
                System.out.println("No such command!");
                break;
        }
    }

    private static void create() {
        System.out.println("Choose type:");
        String type = scanner.next();

        switch (type) {
            case "person": // Create person
                Person.createPerson();
                break;

            default:
                System.out.println("No such type!");
                break;
        }
    }

    static String showHelp(String line) { // Method for printing text
        return line;
    }
}
