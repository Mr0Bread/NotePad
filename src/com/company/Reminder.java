package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable {
    private LocalDate date;
    private boolean dismissedBool;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" + "id=" + getId() + '\'' + "note=" + getNote() + '\'' + "time=" + getTime() + '\'' +
                "date=" + date.format(Asker.DATE_FORMATTER) + '\'' + "dismissed = " + dismissedBool +
                '}';
    }

    @Override
    public void askInfo() {
        super.askInfo();
        date = Asker.askDate("Enter date(yyyy:MM:dd): ");
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || date.format(Asker.DATE_FORMATTER).contains("str");
    }

    @Override
    public boolean isExpired() {
        LocalDateTime dateTime = LocalDateTime.of(date, getTime());
        return LocalDateTime.now().isAfter(dateTime);
    }

    @Override
    public void dismiss() {
        dismissedBool = true;
    }
}
