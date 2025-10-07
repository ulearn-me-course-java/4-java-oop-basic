package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    private void normalizeTime() {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = (totalSeconds % 3600) % 60;
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
        normalizeTime();

    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalizeTime();

    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalizeTime();

    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        normalizeTime();

    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        normalizeTime();

    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

}
