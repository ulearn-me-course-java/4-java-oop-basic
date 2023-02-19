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

    public TimeSpan() {
        this(0, 0, 0);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        adjustTime();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        adjustTime();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        adjustTime();
    }

    private void adjustTime() {
        if (seconds > 60) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (minutes > 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (seconds < 0) {
            minutes--;
            seconds += 60;
        }
        if (minutes < 0) {
            hours--;
            minutes += 60;
        }
    }

    void add(TimeSpan time) {
        hours += time.getHours();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
        adjustTime();
    }

    void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
        adjustTime();
    }

    @Override
    public String toString() {
        return String.format("Hours: %d, Minutes: %d, Seconds: %d.", hours, minutes, seconds);
    }
}
