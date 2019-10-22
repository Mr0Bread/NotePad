package com.company;

public abstract class Record {
    private static int counter = -1;
    private int id;

    public Record() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();

    public boolean contains(String str) {
        return  Integer.toString(id).contains(str);
    }
}

