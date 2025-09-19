package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        correctTime();
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
        correctTime();
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        correctTime();
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        correctTime();
    }

    private void correctTime() {
        int totalSecond = hours * 3600 + minutes * 60 + seconds;
        this.hours = totalSecond / 3600;
        this.minutes = (totalSecond % 3600) / 60;
        this.seconds = (totalSecond % 3600) % 60;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        correctTime();
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        correctTime();
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
