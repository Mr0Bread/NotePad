package com.company;

public class Record {
    private static int counter = -1;
    private int id;

    public Record() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }
}
