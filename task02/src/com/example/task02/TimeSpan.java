package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        setNormalTime();
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        setNormalTime();
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;

        setNormalTime();
    }

    public String toString() {
        return String.format("%dh:%dm:%ds", hours, minutes, seconds);
    }

    private void setNormalTime() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;

        if (seconds < 0) {
            minutes -= 1;
            seconds = 60 + seconds;
        }

        if (minutes < 0) {
            hours -= 1;
            minutes = 60 + minutes;
        }

        if (hours < 0) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }
}