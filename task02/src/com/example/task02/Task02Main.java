package com.example.task02;

class TimeSpan {

    private int second;
    private int minute;
    private int hour;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
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

    public TimeSpan (int hours, int minutes, int seconds){
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }

    public void add (TimeSpan time){
        second += this.second;
        hour += this.hour;
        minute += this.minute;
    }

    public void subtract (TimeSpan time){
        second -= this.second;
        hour -= this.hour;
        minute -= this.minute;
    }

    public String toString() {
        return String.format("(%d,%d)", second, hour, minute);
    }

    public static void main(String[] args) {

    }
}
