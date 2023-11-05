package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void add(TimeSpan ts){
        hours += ts.hours;
        minutes += ts.minutes;
        seconds += ts.seconds;
    }

    public void subtract(TimeSpan ts){
        hours -= ts.hours;
        minutes -= ts.minutes;
        seconds -= ts.seconds;
    }

    @Override
    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
