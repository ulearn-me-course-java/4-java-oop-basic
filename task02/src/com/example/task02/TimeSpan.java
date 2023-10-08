package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
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
        if(minutes < 0) {
            hours -= minutes / 60 + 1;
            this.minutes = 60 + (minutes % 60);
            return;
        }
        setHours(hours + minutes / 60);
        this.minutes = minutes % 60;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        if(seconds < 0) {
            minutes -= seconds / 60 + 1;
            this.seconds = 60 + (seconds % 60);
            return;
        }
        setMinutes(minutes + seconds / 60);
        this.seconds = seconds % 60;
    }
    void add(TimeSpan time) {
        setSeconds(seconds + time.seconds);
        setMinutes(minutes + time.minutes);
        hours += time.hours;
    }
    void subtract(TimeSpan time) {
        setSeconds(seconds - time.seconds);
        setMinutes(minutes - time.minutes);
        hours -= time.hours;
    }
    public String toString() {
        return String.format("%dh %dm %ds", hours, minutes, seconds);
    }

}
