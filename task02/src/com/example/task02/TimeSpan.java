package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(TimeSpan timeSpan) {
        hours += timeSpan.hours;
        minutes += timeSpan.minutes;
        seconds += timeSpan.seconds;
    }

    void subtract(TimeSpan timeSpan) {
        hours -= timeSpan.hours;
        minutes -= timeSpan.minutes;
        seconds -= timeSpan.seconds;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
