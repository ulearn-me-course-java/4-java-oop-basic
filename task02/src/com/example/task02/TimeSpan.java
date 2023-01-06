package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        newTime();
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
        newTime();
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
        newTime();
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
        newTime();
    }
    private void newTime() {
        if (seconds > 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes > 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (minutes < 0) {
            hours--;
            minutes += 60;
        }
    }
    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        newTime();
    }
    void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
        newTime();
    }
    public String toString() {
        return String.format("Hours: %d, Minutes: %d, Seconds: %d.", hours, minutes, seconds);
    }
}