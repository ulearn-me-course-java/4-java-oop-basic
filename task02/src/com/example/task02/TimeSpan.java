package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan() {}

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);

        //this.hours = hours;
        //this.minutes = minutes;
        //this.seconds = seconds;
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
        hours += minutes / 60;
        this.minutes = minutes % 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        hours += seconds / 3600;
        minutes += seconds / 60 % 60;
        this.seconds = seconds % 60;
    }

    void add(TimeSpan timeSpan) {
        seconds += timeSpan.seconds;
        minutes += timeSpan.minutes + seconds / 60;
        seconds %= 60;
        hours += timeSpan.hours + minutes / 60;
        minutes %= 60;

        /*
        int  totalSeconds = seconds + timeSpan.seconds
                + (minutes + timeSpan.minutes) * 60
                + (hours + timeSpan.hours) * 3600;
        seconds = totalSeconds % 60;
        minutes = totalSeconds / 60 % 60;
        hours = totalSeconds / 3600;
        */
    }

    void subtract(TimeSpan timeSpan) {
        int  totalSeconds = seconds - timeSpan.seconds
                + (minutes - timeSpan.minutes) * 60
                + (hours - timeSpan.hours) * 3600;
        seconds = totalSeconds % 60;
        minutes = totalSeconds / 60 % 60;
        hours = totalSeconds / 3600;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}