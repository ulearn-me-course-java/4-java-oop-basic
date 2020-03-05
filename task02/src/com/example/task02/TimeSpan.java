package com.example.task02;

public class TimeSpan {
    private int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private int minets;

    public int getMinets() {
        return minets;
    }

    public void setMinets(int minets) {
        this.minets = minets;
    }

    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public TimeSpan(int hours, int minets, int seconds){
        this.hours = hours;
        this.minets = minets;
        this.seconds = seconds;
    }

    void add(TimeSpan time){
        hours += time.hours;
        minets += time.minets;
        seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        hours -= time.hours;
        minets -= time.minets;
        seconds -= time.seconds;
    }

    public String toString(){
        return String.format("d%:d%:d%", hours, minets, seconds);
    }
}
