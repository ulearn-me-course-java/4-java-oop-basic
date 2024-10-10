package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

        normalize();
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;

        normalize();
    }

    public void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;

        normalize();
    }

    private void normalize() {
        int wholeMinutesInSeconds = seconds / 60;
        if(Math.abs(wholeMinutesInSeconds) >= 1) {
            minutes += wholeMinutesInSeconds;
            seconds -= 60 * wholeMinutesInSeconds;
        }

        int wholeHoursInMinutes = minutes / 60;
        if(Math.abs(wholeHoursInMinutes) >= 1) {
            hours += wholeHoursInMinutes;
            minutes -= 60 * wholeHoursInMinutes;
        }

        if(seconds < 0) {
            minutes--;
            seconds = 60 - Math.abs(seconds);
        }
        if(minutes < 0) {
            hours--;
            minutes = 60 - Math.abs(minutes);
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        normalize();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }
}
