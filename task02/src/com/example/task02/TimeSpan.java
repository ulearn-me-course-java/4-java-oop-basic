package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours + minutes / 60 + seconds / 3600;
        minutes %= 60;
        seconds %= 3600;
        this.minutes = minutes + seconds / 60;
        seconds %= 60;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        hours += minutes / 60;
        this.minutes = minutes % 60;
    }

    public void setSeconds(int seconds) {
        hours = seconds / 3600;
        seconds %= 3600;
        minutes = seconds / 60;
        this.seconds = seconds % 60;
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

    void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += time.getMinutes() + seconds / 60;
        seconds %= 60;
        hours += time.getHours() + minutes / 60 + seconds / 60;
    }

    void subtract(TimeSpan time) {
        seconds -= time.getSeconds();
        if (seconds < 0) {
            seconds += 60;
            minutes--;
        }
        minutes -= time.getMinutes();
        if (minutes < 0) {
            minutes += 60;
            hours--;
        }
        hours -= time.getHours();
        if (hours < 0) System.err.println("Отрицательное время?");
    }

    public String toString() {
        return  Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" +Integer.toString(seconds);
    }
}