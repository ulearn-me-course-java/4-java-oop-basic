package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        normalizeTime();
    }
    private void normalizeTime() {
        minutes += seconds / 60;
        seconds = seconds % 60;

        hours += minutes / 60;
        minutes = minutes % 60;
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        normalizeTime();
    }

    public void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        normalizeTime();
    }

    public String toString() {
        return String.format( hours +":"+ minutes+":"+seconds);
    }
}
