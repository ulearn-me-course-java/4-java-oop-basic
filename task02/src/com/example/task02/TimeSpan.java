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
        this.minutes = minutes % 60;
        setHours(hours + minutes / 60);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds % 60;
        setMinutes(minutes + seconds / 60);
    }

    void add(TimeSpan time) {
        setSeconds(seconds + time.seconds);
        setMinutes(minutes + time.minutes);
        setHours(hours + time.hours);
    }

    void subtract(TimeSpan time) {
        int result = getTotalSeconds() - time.getTotalSeconds();
        seconds = 0;
        minutes = 0;
        hours = 0;
        setSeconds(result);
    }

    public String toString() {
        return String.format("Hours: %d, minutes: %d, seconds: %d", hours, minutes, seconds);
    }

    int getTotalSeconds() {
        return ((hours * 60) + minutes) * 60 + seconds;
    }
}
