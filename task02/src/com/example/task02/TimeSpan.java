package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = (seconds / 3600 + minutes / 60 + hours) % 24;
        this.minutes = (seconds / 60 + minutes) % 60;
        this.seconds = seconds % 60;


    }

    void add(TimeSpan time) {
        minutes += (time.getSeconds() + seconds) / 60;
        seconds = (time.getSeconds() + seconds) % 60;
        hours += (time.getMinutes() + minutes) / 60;
        minutes = (time.getMinutes() + minutes) % 60;
        hours = (time.getHours() + hours) % 24;
    }

    void subtract(TimeSpan time) {
        if (time.getSeconds() > seconds) {
            minutes--;
            seconds = 60 - (time.getSeconds() - seconds);
        } else seconds -= time.getSeconds();
        if (time.getMinutes() > minutes) {
            hours--;
            minutes = 60 - (time.getMinutes() - minutes);
        } else minutes -= time.getMinutes();
        if (time.getHours() > hours) hours = 24 - (time.getHours() - hours);
        else hours -= time.getHours();
    }

    public String toString() {
        return hours + " hours, " + minutes + " minutes, " + seconds + " seconds.";
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
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
