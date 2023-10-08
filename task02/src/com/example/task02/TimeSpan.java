package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        check();
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setHours(int hours) {
        this.hours = hours;
        check();
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
        check();
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
        check();
    }

    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();

        check();
    }
    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();


        while (this.seconds < 0) {
            this.seconds += 60;
            this.minutes--;
        }

        while (this.minutes < 0) {
            this.minutes += 60;
            this.hours--;
        }
        check();
    }

    private void check() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }
    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }
}

