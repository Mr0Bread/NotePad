package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class Asker {
    static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy:MM:dd");
    static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    private static Scanner scanner = new Scanner(System.in);
    static {
        scanner.useDelimiter("\n");
    }

    static LocalDate askDate(String msg) {

        while (true) {

            try {
                System.out.println(msg + "> ");
                String answer = scanner.next();
                return LocalDate.parse(answer, DATE_FORMATTER);

            } catch (DateTimeParseException e) {
                System.out.println("Required format: " + DATE_FORMATTER);
            }
        }
    }

    static LocalTime askTime(String msg) {

        while (true) {

            try {
                System.out.println(msg + "> ");
                String answer = scanner.next();
                return LocalTime.parse(answer, TIME_FORMATTER);

            } catch (DateTimeParseException e) {
                System.out.println("Required format: " + TIME_FORMATTER);
            }
        }
    }

    static String askString(String msg) {
        System.out.print(msg + "> ");
        return scanner.next();
    }

    static int askInt(String msg) {
        while (true) {
            try {
                System.out.print(msg + "> ");
                String answer = scanner.next();
                return Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
    }

}
