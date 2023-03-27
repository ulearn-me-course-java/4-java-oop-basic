package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan() {
    }

    public TimeSpan(int h, int m, int s) {
        this.seconds = s;
        this.minutes = m;
        this.hours = h;
        Check();
    }

    private void Check() {
        if (this.seconds >= 60) {
            this.minutes += seconds / 60;
            this.seconds = seconds % 60;
        }
        if (this.minutes >= 60) {
            this.hours += minutes / 60;
            this.minutes = minutes % 60;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int number) {
        this.seconds = number;
        Check();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int number) {
        this.minutes = number;
        Check();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int number) {
        this.hours = number;
    }

    public void add(TimeSpan time) {
        this.seconds += time.getSeconds();
        this.minutes += time.getMinutes();
        this.hours += time.getHours();
        Check();
    }

    public void subtract(TimeSpan time) {
        this.seconds -= time.getSeconds();
        this.minutes -= time.getMinutes();
        this.hours -= time.getHours();
        Check();
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }
}