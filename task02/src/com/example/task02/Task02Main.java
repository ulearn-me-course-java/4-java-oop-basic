package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(0, 100, 0);
    }
}

class TimeSpan {

    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        int superfluous;
        if (second > 60) {
            superfluous = second / 60;
            minute += superfluous;
            second -= superfluous * 60;
        }
        if (minute > 60) {
            superfluous = minute / 60;
            hour += superfluous;
            minute -= superfluous * 60;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    void add(TimeSpan time) {
        int newHour = hour + time.hour;
        int newMinute = minute + time.minute;
        int newSecond = second + time.second;
        TimeSpan newResult = new TimeSpan(newHour, newMinute, newSecond);
        hour = newResult.hour;
        minute = newResult.minute;
        second = newResult.second;
    }

    void subtract(TimeSpan time) {
        int newHour = hour - time.hour;
        int newMinute = minute - time.minute;
        int newSecond = second - time.second;
        TimeSpan newResult = new TimeSpan(newHour, newMinute, newSecond);
        hour = newResult.hour;
        minute = newResult.minute;
        second = newResult.second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}