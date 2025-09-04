package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        sortTime();
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
        sortTime();
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
        sortTime();
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
        sortTime();
    }

    public void add(TimeSpan timeSpan) {
        this.second += timeSpan.second;
        this.minute += timeSpan.minute;
        this.hour += timeSpan.hour;
        sortTime();
    }
    public void subtract(TimeSpan timeSpan) {
        this.second -= timeSpan.second;
        this.minute -= timeSpan.minute;
        this.hour -= timeSpan.hour;
    }

    public void sortTime(){
        minute += second/60;
        second %= 60;
        hour += minute/60;
        minute %= 60;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
