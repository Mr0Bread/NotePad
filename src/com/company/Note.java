package com.company;

public class Note extends Record {
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

    public void askInfo() {
        note = Asker.askString("Enter your record: ");
    }

    @Override
    public boolean contains(String str) {
        return note.contains(str)
                || super.contains(str);
    }
}
