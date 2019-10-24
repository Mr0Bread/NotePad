package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarm extends Note {
    private LocalTime time;
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "time='" + time.format(FORMATTER) + '\'' +
                "id=" + getId() + '\'' + "Note=" + getNote() +
                '}';
    }


    public void askInfo() {
        super.askInfo();
        System.out.println("Enter time for your alarm: ");
        String strTime = Main.scanner.next();
        time = LocalTime.parse(strTime, FORMATTER);

    }

    @Override
    public boolean contains(String str) {
        return time.format(FORMATTER).contains(str) || super.contains(str);
    }
}