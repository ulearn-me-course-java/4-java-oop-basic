package com.example.task02;

public class TimeSpan {
    private int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            int dif = minutes / 60;
            this.setHours(hours + dif);
            minutes -= dif * 60;
        }
        this.minutes = minutes;
    }

    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 60) {
            int dif = seconds / 60;
            this.setMinutes(this.minutes + dif);
            seconds -= dif * 60;
        }
        this.seconds = seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public void add(TimeSpan time) {
        this.setHours(this.hours + time.hours);
        this.setMinutes(this.minutes + time.minutes);
        this.setSeconds(this.seconds + time.seconds);
    }

    public void subtract(TimeSpan time) {
        this.setHours(this.hours - time.hours);
        this.setMinutes(this.minutes - time.minutes);
        this.setSeconds(this.seconds - time.seconds);
    }

    @Override
    public String toString() {
        return "TimeSpan {" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}