package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        correct();
    }

    public void correct() {
        minute += Math.floorDiv(second, 60);
        second = Math.floorMod(second, 60);

        hour += Math.floorDiv(minute, 60);
        minute = Math.floorMod(minute, 60);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        correct();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        correct();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        correct();
    }

    void add(TimeSpan time) {
        hour += time.hour;
        minute += time.minute;
        second += time.second;
        correct();
    }

    void subtract(TimeSpan time) {
        hour -= time.hour;
        minute -= time.minute;
        second -= time.second;
        correct();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

