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
        this.hours = hours + (minutes + (seconds / 60)) / 60;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.seconds = seconds % 60;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes + (seconds / 60);
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.seconds %= 60;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        this.minutes += this.seconds / 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.seconds %= 60;
    }

    public void add(TimeSpan time) {
        this.hours += time.getHours();
        this.minutes += time.getMinutes();
        this.seconds += time.getSeconds();
        normalize();
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.getHours();
        this.minutes -= time.getMinutes();
        this.seconds -= time.getSeconds();
        normalize();
    }

    private void normalize() {
        if (seconds < 0) {
            minutes -= (Math.abs(seconds) + 59) / 60;
            seconds = (seconds + 60) % 60;
        }

        if (minutes < 0) {
            hours -= (Math.abs(minutes) + 59) / 60;
            minutes = (minutes + 60) % 60;
        }

        if (hours < 0) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }


}
