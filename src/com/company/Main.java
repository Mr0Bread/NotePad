package com.company;


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Enter command, please:");

            String cmd = scanner.next();
            switch (cmd) { // Command switch

                case "exit" : // Command to exit Main
                    return;

                case "help" : // Command to print text
                    String line = showHelp("Hello World");
                    System.out.println(line);
                    break;

            }
        }
    }

    static String showHelp(String line) { // Method for printing text
        return line;
    }
}
