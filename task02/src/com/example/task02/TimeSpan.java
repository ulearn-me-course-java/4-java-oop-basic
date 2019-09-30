package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int seconds;

    TimeSpan(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    TimeSpan() {
    }

    void add(TimeSpan time) {
        hour += time.getHour();
        minute += time.getMinute();
        seconds += time.getSeconds();
    }

    void subtract(TimeSpan time) {
        hour -= time.getHour();
        minute -= time.getMinute();
        seconds -= time.getSeconds();
    }

    public String toString() {
        return String.format("Часов: %d, Минут: %d, Секунд: %d", hour, minute, seconds);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
