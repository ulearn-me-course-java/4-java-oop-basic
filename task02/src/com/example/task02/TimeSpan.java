package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        timeCheck();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours){
        this.hours = hours;
        timeCheck();
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
        timeCheck();
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
        timeCheck();
    }

    public void timeCheck() {
        if (seconds > 60) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }


        if (minutes > 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }
    }

    public void toPositiveTime() {
        while (seconds < 0) {
            minutes--;
            seconds += 60;
            if (minutes < 0) throw new RuntimeException("Минут больше нет.");
        }
        while (minutes < 0) {
            hours--;
            minutes += 60;
            if (hours < 0) throw new RuntimeException("Часов больше нет.");
        }
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        timeCheck();
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        toPositiveTime();
    }

    public String toString() {
        return String.format("%d:%d:%d)", hours, minutes, seconds);
    }

}
