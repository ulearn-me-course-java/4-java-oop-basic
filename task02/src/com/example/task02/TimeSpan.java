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

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.hours = seconds / 3600;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    public void add(TimeSpan time) {
        int addingTimeInSec = time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
        int currentTimeInSec = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds();
        int newTimeInSec = addingTimeInSec + currentTimeInSec;
        this.setSeconds(newTimeInSec);
    }

    public void subtract(TimeSpan time) {
        int dedactibleTimeInSec = time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
        int currentTimeInSec = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds();
        int newTimeInSec = dedactibleTimeInSec - currentTimeInSec;
        this.setSeconds(newTimeInSec);
    }

    public String toString() {
        return String.format("%s:%s:%s", this.hours, this.minutes, this.seconds);
    }
}
