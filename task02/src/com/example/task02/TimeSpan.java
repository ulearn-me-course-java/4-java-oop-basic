package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        normalizeTime();
    }

    void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        normalizeTime();
    }

    void normalizeTime() {
        int total = hours * 3600 + minutes * 60 + seconds;

        if (total < 0) {
            total = 0;
        }

        hours = total / 3600;
        minutes = (total % 3600) / 60;
        seconds = total % 60;
    }

    public String toString() {
        return String.format("%dh %dm %ds", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int amount) {
        hours = amount;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int amount) {
        minutes = amount;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int amount) {
        seconds = amount;
    }
}