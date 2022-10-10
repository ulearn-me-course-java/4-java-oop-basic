package com.example.task02;

import java.sql.Time;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public void setHours (int h) {
        hours = h;
    }
    public int getHours () {
        return hours;
    }

    public void setMinutes (int m) {
        minutes = m;
    }
    public int getMinutes () {
        return minutes;
    }

    public void setSeconds (int s) {
        seconds = s;
    }
    public int getSeconds () {
        return seconds;
    }

    public TimeSpan(int h, int m, int s) {

        if (s >= 60) {
            m += s / 60;
        }
        if (m >= 60) {
            h += m / 60;
        }

        hours = h;
        minutes = m % 60;
        seconds = s % 60;
    }

    void add(TimeSpan time) {
        int seconds = time.getSeconds() + this.seconds;
        int minutes = time.getMinutes() + this.minutes;
        int hours = time.getHours() + this.hours;

        if (seconds >= 60) {
            minutes += seconds / 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
        }

        this.seconds = seconds % 60;
        this.minutes = minutes % 60;
        this.hours = hours;
    }

    void subtract(TimeSpan time) {
        int hours = this.hours - time.getHours();
        int minutes = this.minutes - time.getMinutes();
        int seconds = this.seconds - time.getSeconds();

        if (seconds < 0) {
            seconds = 60 - seconds;
            minutes--;
        }
        if (minutes < 0) {
            minutes = 60 - minutes;
            hours--;
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return hours + "; " + minutes + "; " + seconds;
    }
}
