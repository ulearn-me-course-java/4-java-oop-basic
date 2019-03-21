package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    void add(TimeSpan time) {
        int sumSec = second + time.second;
        second = sumSec % 60;

        int sumMin = minute + time.minute + (int) (sumSec / 10);
        minute = sumMin % 60;

        hour += time.hour + (int) (sumMin / 60);
    }

    void subtract(TimeSpan time) {
        if (second < time.second) {
            minute--;
            second += 60 - time.second;
        } else {
            second -= time.second;
        }

        if (minute < time.minute) {
            hour--;
            minute += 60 - time.minute;
        } else {
            minute -= time.minute;
        }

        hour -= time.hour;
    }

    public String toString() {
        return String.format("%d : %d : %d", hour, minute, second);
    }
}
