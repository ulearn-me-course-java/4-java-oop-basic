package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }
}
class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return this.seconds;
    }

    void add(TimeSpan time) {
        hours += this.hours;
        minutes += this.minutes;
        seconds += this.seconds;
    }

    void subtract(TimeSpan time){
        hours -= this.hours;
        minutes -= this.minutes;
        seconds -= this.seconds;
    }

    public String toString(){
        return String.format("%d:%d:%d",  hours, minutes, seconds);
    }
}
