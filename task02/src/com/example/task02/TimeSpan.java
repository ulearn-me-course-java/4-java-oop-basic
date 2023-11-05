package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
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
        this.hours += minutes / 60;
        this.minutes = minutes % 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.minutes += seconds / 60;
        this.seconds = seconds % 60;
    }

    public void add(TimeSpan time) {
        setHours(hours + time.getHours());
        setMinutes(minutes + time.getMinutes());
        setSeconds(seconds + time.getSeconds());
    }

    public void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
        while (hours > 0 && minutes < 0) {
            hours--;
            minutes += 60;
        }
        while (minutes > 0 && seconds < 0) {
            minutes--;
            seconds += 60;
        }
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
