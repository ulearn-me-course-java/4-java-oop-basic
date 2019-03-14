package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public TimeSpan(int hours){
        this(hours, 0);
    }

    public TimeSpan(int hours, int minutes){
        this(hours, minutes, 0);
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void add(TimeSpan time){
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
    }

    public void subtract(TimeSpan time){
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
