package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hour, int minute, int second) {
        this.hours = hour;
        this.minutes = minute;
        this.seconds = second;
        allocationTime();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        allocationTime();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        allocationTime();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        allocationTime();
    }

    public void allocationTime() {
        if (this.minutes > 60) {
                this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.seconds > 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }
        if (this.minutes < 0) {
            this.hours -= (minutes / 60) + 1;
            this.minutes = 60 + this.minutes;
        }
        if(this.hours < 0) this.hours = 0;
    }

    void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        allocationTime();
    }

    void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
        allocationTime();
    }

    public String toString() {
        return String.format("%dh:%dm:%ds", this.hours, this.minutes, this.seconds );
    }
}
