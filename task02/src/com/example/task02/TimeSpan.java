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

    public void setHours(int h) {
        hours = h;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int m) {
        minutes = m;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int s) {
        seconds = s;
    }

    public void add(TimeSpan t) {
        seconds += t.getSeconds();
        minutes += t.getMinutes();
        hours += t.getHours();
    }

    public void subtract(TimeSpan t) {
        seconds -= t.getSeconds();
        minutes -= t.getMinutes();
        hours -= t.getHours();
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
