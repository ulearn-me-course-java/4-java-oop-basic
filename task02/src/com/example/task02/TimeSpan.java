package com.example.task02;

public class TimeSpan {
    private int hour, minutes, seconds;

    public TimeSpan(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
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

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    void add(TimeSpan timeSpan){
        hour += timeSpan.hour;
        minutes += timeSpan.minutes;
        seconds += timeSpan.seconds;
    }

    void subtract(TimeSpan timeSpan){
        hour -= timeSpan.hour;
        minutes -= timeSpan.minutes;
        seconds -= timeSpan.seconds;
    }
}
