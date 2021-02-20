package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minutes, int hours) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    //region Getters And Setters
    //alt+insert -> Generate -> Getters and Setters
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        setMinutes(minutes + seconds / 60);
        this.seconds = seconds % 60;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        setHours(hours + minutes / 60);
        this.minutes = minutes % 60;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    //endregion

    public void add(TimeSpan time) {
        setSeconds(seconds + time.seconds);
        setMinutes(minutes + time.minutes);
        setHours(hours + time.hours);
    }

    public void subtract(TimeSpan time) {
        setSeconds(seconds - time.seconds);
        setMinutes(minutes - time.minutes);
        setHours(hours - time.hours);
    }

    @Override
    public String toString() {
        return String.format("%d S, %d M, %d H",seconds,minutes,hours);
    }
}
