package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;
    public TimeSpan(int hour, int minute, int second) {
        int totalTime = hour * 3600 + minute * 60 + second;
        this.hour = totalTime / 3600;
        this.minute = (totalTime / 60) % 60;
        this.second = totalTime % 60;
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
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        hour = minute / 60;
        this.minute = minute % 60;
    }
    public void setSecond(int second) {
        hour = minute / 3600;
        this.second = second % 60;
        second /= 60;
        minute = second % 60;
    }
    void add(TimeSpan time) {
        int totalTime = (hour + time.hour) * 3600 + (minute + time.minute) * 60 + second + time.second;
        hour = totalTime / 3600;
        minute = (totalTime / 60) % 60;
        second = totalTime % 60;
    }
    void subtract(TimeSpan time) {
        int totalTime = (hour - time.hour) * 3600 + (minute - time.minute) * 60 + second - time.second;
        hour = totalTime / 3600;
        minute = (totalTime / 60) % 60;
        second = totalTime % 60;
    }
    public String toString() {
        String t1 = String.valueOf(hour);
        String t2 = String.valueOf(minute);
        String t3 = String.valueOf(second);
        return t1 + ":" + t2 + ":" + t3;
    }
}
