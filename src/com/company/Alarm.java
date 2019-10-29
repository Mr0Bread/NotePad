package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private LocalDate dismissedAt;

    LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "time='" + time.format(Asker.TIME_FORMATTER) + '\'' +
                "id=" + getId() + '\'' + "Note=" + getNote() +
                '}';
    }

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askTime("Enter time(HH:mm)");
    }

    @Override
    public boolean contains(String str) {
        return time.format(Asker.TIME_FORMATTER).contains(str) || super.contains(str);
    }

    @Override
    public boolean isExpired() {
        if (LocalDate.now().equals(dismissedAt)) {
            return false;
        }
        return LocalTime.now().isAfter(time);
    }

    @Override
    public void dismiss() {
        dismissedAt = LocalDate.now();
    }
}