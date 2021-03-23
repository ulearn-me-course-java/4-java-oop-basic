package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

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

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan timeSpan) {
        hours = hours + timeSpan.hours;
        minutes = minutes + timeSpan.minutes;
        seconds = seconds + timeSpan.seconds;
    }

    void subtract(TimeSpan timeSpan) {
        hours = hours - timeSpan.hours;
        minutes = minutes - timeSpan.minutes;
        seconds = seconds - timeSpan.seconds;
    }

    public String toString() {
        return String.format("%dh:%dm:%ds", hours, minutes, seconds);
    }
}