package com.company;

import java.util.ArrayList;

public class Note extends Record {
    static ArrayList<Note> noteArrayList = new ArrayList<>();
    private String note;

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                "id=" + getId() +
                '}';
    }

    public void setNote(String note) {
        this.note = note;
    }

    static void createNote() {
        Note n = new Note();
        System.out.println("Enter your record:");
        String record = Main.scanner.next();
        n.setNote(record);
        noteArrayList.add(n);

    }

    static void showNote() {
        noteArrayList.stream().forEach(noteArrayList -> System.out.println(noteArrayList.toString()));
    }
}
