package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeSpan() {
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes <= 60) {
            this.minutes = minutes;
        } else {
            this.seconds = seconds % 60;
            hours += (minutes / 60);
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds <= 60) {
            this.seconds = seconds;
        } else {
            this.seconds = seconds % 60;
            minutes += (seconds / 60);
        }
    }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }
    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }
    public String toString(){
        return String.format("%d:%d:%d",hours,minutes,seconds);
    }
}

