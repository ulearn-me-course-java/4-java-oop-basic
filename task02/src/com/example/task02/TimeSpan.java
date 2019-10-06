package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new RuntimeException("Error seconds");
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new RuntimeException("Error minutes");
        }
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new RuntimeException();
        }
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    TimeSpan(int hours, int minutes, int seconds) {
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    void add(TimeSpan time) {
        seconds += time.getSeconds();
        minutes += time.getMinutes();
        hours += time.getHours();
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }

        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }

    void subtract(TimeSpan time) {
        int sec = Math.abs((hours * 3600 + minutes * 60 + seconds) - (time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds()));
        hours = sec / 3600;
        sec -= hours * 3600;
        minutes = sec / 60;
        sec -= minutes * 60;
        seconds = sec;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
