package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        adjustTime();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0) {
            this.seconds = seconds;
        }
    }

    public void add(TimeSpan time) {
        this.hours += hours;
        this.minutes += minutes;
        this.seconds += seconds;

        adjustTime();
    }

    public void subtract(TimeSpan time) {
        this.hours -= hours;
        this.minutes -= minutes;
        this.seconds -= seconds;

        adjustTime();
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private void adjustTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }
}
