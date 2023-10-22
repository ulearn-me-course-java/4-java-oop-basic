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

    public int getHours() {
        return hours;
    }
    public void setHours(int value) {
        hours = value > 23 ? value - 24 * (value/24) : value;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int value) {
        if (value >= 60){
            setHours(value/60);
            minutes = value - 60 * (value/60);
        }
        else minutes = value;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int value) {
        if (seconds >= 60) {
            setMinutes(value/60);
            seconds = value - 60 * (value/60);
        }
        else seconds = value;
    }
    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();

        if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
    }
    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();

        if (this.seconds < 0) {
            this.minutes--;
            this.seconds += 60;
        }

        if (this.minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }
    }
    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
