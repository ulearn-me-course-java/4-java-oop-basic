package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours) {
        this.seconds = seconds % 60;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.hours = hours + (minutes / 60);
    }

    public void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += time.getMinutes();
        hours += time.getHours();
        normalizeTime();
    }

    public void subtract(TimeSpan time) {
        seconds -= time.getSeconds();
        minutes -= time.getMinutes();
        hours -= time.getHours();
        normalizeTime();
    }

    public void normalizeTime() {
        if (seconds < 0) {
            minutes--;
            seconds += 60;
        }
        minutes += seconds / 60;
        seconds %= 60;

        if (minutes < 0) {
            hours--;
            minutes += 60;
        }
        hours += minutes / 60;
        minutes %= 60;

        if (hours < 0) {
            hours = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String toString() {
        return String.format("%dч %dм %dс", hours, minutes, seconds);
    }
}
