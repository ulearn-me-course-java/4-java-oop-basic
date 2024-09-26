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
        if (minutes > 59) {
            setHours(hours + minutes / 60);
            minutes = minutes % 60;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 59) {
            setMinutes(minutes + seconds / 60);
            seconds = seconds % 60;
        }
        this.seconds = seconds;
    }

    public void add(TimeSpan span) {
        setHours(hours + span.getHours());
        setMinutes(minutes + span.getMinutes());
        setSeconds(seconds + span.getSeconds());
    }

    public void subtract(TimeSpan span) {
        setHours(hours - span.getHours());
        setMinutes(minutes - span.getMinutes());
        setSeconds(seconds - span.getSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
