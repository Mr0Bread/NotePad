package com.company;

public class Alarm extends Note {
    private String time;


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "time='" + time + '\'' +
                "id=" + getId() + '\'' + "Note=" + getNote() +
                '}';
    }


    public void askInfo() {
        super.askInfo();
        System.out.println("Enter time for your alarm: ");
        time = Main.scanner.next();

    }

    @Override
    public boolean contains(String str) {
        return time.contains(str) || super.contains(str);
    }
}