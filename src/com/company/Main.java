package com.company;


import java.util.ArrayList;

public class Main {

    private static ArrayList<Record> recordsArrayList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            String cmd = Asker.askString("Enter command, please: ");
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

                case "find":
                    search();
                    break;

                case "delete":
                    delete();
                    break;

                case "expired":
                    listExpiredRecords();
                    break;

                default:
                    System.out.println("No such command in program!");

            }
        }
    }

    private static void create() {
        String type = Asker.askString("Choose type: ");

        switch (type) {
            case "person": // Create person
                createRecord(new Person());
                break;

            case "note":
                createRecord(new Note());
                break;

            case "alarm":
                createRecord(new Alarm());
                break;

            case "remind":
                createRecord(new Reminder());
                break;

            default:
                System.out.println("No such type!");
                break;
        }
    }

    private static String showHelp(String line) { // Method for printing text
        return line;
    }

    private static void showRecords() {
        recordsArrayList.forEach(r -> System.out.println(r.toString()));
    }

    private static void createRecord(Record r) {
        r.askInfo();
        recordsArrayList.add(r);
    }

    private static void delete() {
        int size = recordsArrayList.size();
        int ID = Asker.askInt("Enter ID of record you want to delete: ");

        for (int i = 0; i < size; i++) {
            Record r = recordsArrayList.get(i);

            if (r.getId() == ID) {
                recordsArrayList.remove(i);
                break;
            }
        }
    }

    private static void search() {
        String search = Asker.askString("Enter search word: ");
        for (Record r : recordsArrayList) {
            if (r.contains(search)) {
                System.out.println(r);
            }
        }
    }

    private static void listExpiredRecords() {

        for (Record r : recordsArrayList) {

            if (r instanceof Expirable) {
                Expirable expirable = (Expirable) r;
                if (expirable.isExpired()) {
                    System.out.println(expirable);
                }
            }
        }
    }

}
