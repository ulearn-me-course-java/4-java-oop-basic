package com.example.task02;

public class TimeSpan {
    private int sec;
    private int min;
    private int hours;

    public TimeSpan(int sec, int min, int hours){
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    void add(TimeSpan time){
        hours += time.hours;
        min += time.min;
        sec += time.sec;
    }

    void subtract(TimeSpan time){
        hours -= time.hours;
        min -= time.min;
        sec -= time.sec;
    }

    public String toString(){
        return String.format("(%d:%d:%d)", hours, min, sec);
    }
}


