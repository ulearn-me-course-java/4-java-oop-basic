package com.example.task02;

public class TimeSpan {
    public TimeSpan() {
        new TimeSpan(0, 0, 0);
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    private int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int value) {
        hours = value;
    }

    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int value) {
        minutes = value;
    }

    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int value) {
        seconds = value;
    }

    void add(TimeSpan time) {
        setHours(hours + time.getHours());
        setMinutes(minutes + time.getMinutes());
        setSeconds(seconds + time.getSeconds());
        if (seconds >= 60) {
            setSeconds(seconds - 60);
            setMinutes(minutes + 1);
        }
        if (minutes >= 60) {
            setMinutes(minutes - 60);
            setHours(hours + 1);
        }
    }

    void subtract(TimeSpan time) {
        if ((hours * 3600 + minutes * 60 + seconds) - (time.hours * 3600 + minutes * 60 + seconds) < 0)
            throw new ArithmeticException();
        if (seconds < time.getSeconds()) {
            setMinutes(minutes - 1);
            setSeconds(seconds + 60);
        }
        if (minutes < time.getMinutes()) {
            setHours(hours - 1);
            setMinutes(minutes + 60);
        }
        setHours(hours - time.getHours());
        setMinutes(minutes - time.getMinutes());
        setSeconds(seconds - time.getSeconds());
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
