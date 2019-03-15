package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;

    TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        int globalSeconds = time.hours * 3600 + time.minutes * 60 + time.seconds +
                hours * 3600 + minutes * 60  + seconds;

        hours = globalSeconds / 3600;
        minutes = (globalSeconds - hours * 3600) / 60;
        seconds = globalSeconds - hours * 3600 - minutes * 60;
    }

    void subtract(TimeSpan time) {
        int globalSeconds = (hours * 3600 + minutes * 60  + seconds) -
                (time.hours * 3600 + time.minutes * 60 + time.seconds);

        hours = globalSeconds / 3600;
        minutes = (globalSeconds - hours * 3600) / 60;
        seconds = globalSeconds - hours * 3600 - minutes * 60;
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

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("[%d:%d:%d]", hours, minutes, seconds);
    }
}
