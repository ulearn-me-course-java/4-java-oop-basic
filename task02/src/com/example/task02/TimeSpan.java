package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds() {
        this.seconds = seconds;
    }

    public  int getMinutes() {
        return minutes;
    }

    public void setMinutes() {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours() {
        this.hours = hours;
    }

    public TimeSpan(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
    }

    void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
