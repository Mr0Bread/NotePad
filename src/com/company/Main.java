package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Record> recordsArrayList = new ArrayList<>();

    public static void main(String[] args) {

        scanner.useDelimiter("\n");

        while (true) {

            System.out.println("Enter command, please:");

            String cmd = scanner.next();
            switch (cmd) { // Command switch

                case "exit":   // Command to exit Main
                    System.out.println("Farewell!");
                    return;

                case "help": // Command to print text
                    String line = showHelp("no");
                    System.out.println(line);
                    break;

                case "create":
                    create();
                    break;

                case "show":
                    showRecords();
                    break;

                case "search" :
                    search();
                    break;

                default:
                    System.out.println("No such command in program!");

            }
        }
    }

    private static void search() {
        System.out.println("Enter search word: ");
        String search = scanner.next();
        for (int i = 0; i < recordsArrayList.size(); i++) {

        }
    }

    private static void create() {
        System.out.println("Choose type:");
        String type = scanner.next();

        switch (type) {
            case "person": // Create person
                createRecord(new Person());
                break;

            case "note" :
                createRecord(new Note());
                break;

            case "alarm" :
                createRecord(new Alarm());
                break;

            default:
                System.out.println("No such type!");
                break;
        }
    }

    static String showHelp(String line) { // Method for printing text
        return line;
    }

    static void showRecords() {
        recordsArrayList.forEach(r -> System.out.println(r.toString()));
    }

    private static void createRecord(Record r) {
        r.askInfo();
        recordsArrayList.add(r);
    }

}
