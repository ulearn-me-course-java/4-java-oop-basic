package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int seconds) throws Exception {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws Exception {
        if (hours < 0) {
            throw new Exception("Hours must not be negative");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws Exception  {
        if (minutes < 0) {
            throw new Exception("Minutes must not be negative");
        }
        else if (minutes > 59) {
            throw new Exception("Minutes must not be more than 59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws Exception {
        if (seconds < 0) {
            throw new Exception("Seconds must not be negative");
        }
        else if (seconds > 59) {
            throw new Exception("Seconds must not be more than 59");
        }
        this.seconds = seconds;
    }

    public void add(TimeSpan time) {
        if (time.getSeconds() + seconds > 59){
            minutes++;
            seconds = (time.getSeconds() + seconds) % 60;
        }
        else {
            seconds += time.getSeconds();
        }
        if (time.getMinutes() + minutes > 59){
            hours++;
            minutes = (time.getMinutes() + minutes) % 60;
        }
        else {
            minutes += time.getMinutes();
        }
        hours += time.getHours();
    }

    public void subtract(TimeSpan time) throws Exception {
        if (seconds - time.getSeconds() < 0) {
            seconds = 60 - (time.getSeconds() - seconds);
            minutes--;
        }
        else {
            seconds -= time.getSeconds();
        }
        if (minutes - time.getMinutes() < 0) {
            minutes = 60 - (time.getMinutes() - minutes);
            hours--;
        }
        else {
            minutes -= time.getMinutes();
        }
        if (hours - time.getHours() < 0) {
            throw new Exception("The operation resulted in a negative time. Time must not be negative");
        }
        else {
            hours -= time.getHours();
        }
    }

    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
