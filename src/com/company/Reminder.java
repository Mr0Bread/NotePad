package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm {
    private LocalDate date;
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy:MM:dd");

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" + "id=" + getId() + '\'' + "note=" + getNote() + '\'' + "time=" + getTime() + '\'' +
                "date=" + date.format(FORMATTER) +
                '}';
    }

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Enter date to remind");
        String dateString = Main.scanner.next();
        date = LocalDate.parse(dateString, FORMATTER);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || date.format(FORMATTER).contains("str");
    }
}
