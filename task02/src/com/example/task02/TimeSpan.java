package com.example.task02;

public class TimeSpan {

    private int hours, minutes, seconds;

    private final int secondsInHour = 3600;
    private final int minutesInHour = 60;
    private final int secondsInMinute = 60;

    public TimeSpan(int seconds, int minutes, int hours) {
        calculateTime(seconds, minutes, hours);
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }

    public void subtract(TimeSpan time) {
        calculateTime(this.getSeconds() - time.getSeconds(),
                      this.getMinutes() - time.getMinutes(),
                        this.getHours() - time.getHours());
    }

    public void add(TimeSpan time) {
        calculateTime(time.getSeconds() + this.getSeconds(),
                      time.getMinutes() + this.getMinutes(),
                        time.getHours() + this.getHours());
    }

    private void calculateTime(int seconds, int minutes, int hours) {
        hours *= secondsInHour;
        minutes *= secondsInMinute;
        int totalSec = hours + minutes + seconds;

        this.hours = totalSec / secondsInHour;
        totalSec %= secondsInHour;
        this.minutes = totalSec / secondsInMinute;
        totalSec %= secondsInMinute;
        this.seconds = totalSec;
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
        minutes %= minutesInHour;
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        seconds %= secondsInMinute;
        this.seconds = seconds;
    }
}