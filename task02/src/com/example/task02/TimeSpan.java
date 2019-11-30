package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(hours);
        setSeconds(seconds);
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
        if(hours < 0 || hours > 24) {
            this.hours = 0;
        }

        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 60) {
            this.minutes = 0;
        }

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 24) {
            this.seconds = 0;
        }

        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        int currentTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        int timeInSeconds = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int secondsSum = currentTimeInSeconds - timeInSeconds;

        hours = secondsSum / 3600;
        minutes = (secondsSum - hours * 3600) / 60;
        seconds = secondsSum - hours * 3600 - minutes * 60;
    }

    void subtract(TimeSpan time) {
        int currentTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        int timeInSeconds = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int secondsDifference = currentTimeInSeconds - timeInSeconds;

        hours = secondsDifference / 3600;
        minutes = (secondsDifference - hours * 3600) / 60;
        seconds = secondsDifference - hours * 3600 - minutes * 60;
    }

    public String toString() {
        return String.format("[%d:%d:%d]", hours, minutes, seconds);
    }
}
